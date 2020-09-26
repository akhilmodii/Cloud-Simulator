package Factory;

import hw1.ApplicationConstants;
import org.cloudbus.cloudsim.allocationpolicies.VmAllocationPolicyFirstFit;
import org.cloudbus.cloudsim.brokers.DatacenterBroker;
import org.cloudbus.cloudsim.brokers.DatacenterBrokerSimple;
import org.cloudbus.cloudsim.cloudlets.Cloudlet;
import org.cloudbus.cloudsim.cloudlets.CloudletSimple;
import org.cloudbus.cloudsim.core.CloudSim;
import org.cloudbus.cloudsim.datacenters.Datacenter;
import org.cloudbus.cloudsim.datacenters.DatacenterSimple;
import org.cloudbus.cloudsim.hosts.Host;
import org.cloudbus.cloudsim.hosts.HostSimple;
import org.cloudbus.cloudsim.network.topologies.BriteNetworkTopology;
import org.cloudbus.cloudsim.network.topologies.NetworkTopology;
import org.cloudbus.cloudsim.provisioners.PeProvisionerSimple;
import org.cloudbus.cloudsim.resources.Pe;
import org.cloudbus.cloudsim.resources.PeSimple;
import org.cloudbus.cloudsim.utilizationmodels.UtilizationModel;
import org.cloudbus.cloudsim.utilizationmodels.UtilizationModelFull;
import org.cloudbus.cloudsim.vms.Vm;
import org.cloudbus.cloudsim.vms.VmSimple;
import org.cloudsimplus.builders.tables.CloudletsTableBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;


public class DataCenter3 {
    public static final int VM_PES = 1;
    private final List<Datacenter> datacenterList;
    private final List<Cloudlet> cloudletList;
    private final List<Vm> vmList;
    private final CloudSim simulation;
    private final DatacenterBroker broker;
    ApplicationConstants appConst = new ApplicationConstants();
    private static final Logger logger = LoggerFactory.getLogger(DataCenter3.class);




    public static void main(String[] args){
        new DataCenter3();
    }


    private DataCenter3(){
        datacenterList = new ArrayList<>();
        cloudletList = new ArrayList<>();
        vmList = new ArrayList<>();
        simulation = new CloudSim();

        logger.info("Loading Datacenters...");
        int numDatacenters = Integer.parseInt(appConst.getNumOfDatacenters());
        for(int i = 0; i < numDatacenters; i++){
            datacenterList.add(createDatacenter());
        }

        broker = createBroker();
        configureNetwork();

        // creating VMs and Cloudlets
        createVMs();
        createCloudlets();

        simulation.start();
        new CloudletsTableBuilder(broker.getCloudletFinishedList()).build();
        System.out.println(getClass().getSimpleName() + " finished.");

    }

    private void configureNetwork(){
        NetworkTopology networkTopology = BriteNetworkTopology.getInstance(appConst.getNetworkTopology());
        simulation.setNetworkTopology(networkTopology);

        logger.info("Configuring Network...");
        int briteNode = 0;
        networkTopology.mapNode(datacenterList.get(0).getId(), briteNode);

        briteNode = 2;
        networkTopology.mapNode(datacenterList.get(0).getId(), briteNode);

        briteNode = 3;
        networkTopology.mapNode(broker.getId(), briteNode);
    }

    private void createCloudlets(){
         final  long length = Integer.parseInt(appConst.getLength());
         final long fileSize = Integer.parseInt(appConst.getFileSize());
         final long outputSize = Integer.parseInt(appConst.getOutputSize());
         final UtilizationModel utilizationModel = new UtilizationModelFull();

         logger.info("Creating Cloudlets...");
         final long numCloudlets = Integer.parseInt(appConst.getNumOfCloudlets());
         for(int i = 0; i < numCloudlets; i++){
             Cloudlet cloudlet = new CloudletSimple(length, VM_PES).setFileSize(fileSize).setOutputSize(outputSize).setUtilizationModel(utilizationModel);
             cloudletList.add(cloudlet);
             broker.bindCloudletToVm(cloudletList.get(i), vmList.get(i));
         }
         broker.submitCloudletList(cloudletList);

    }

    private void createVMs(){

        final  long mips = Integer.parseInt(appConst.getMips());
        final  long size = Integer.parseInt(appConst.getSize());
        final  long ram = Integer.parseInt(appConst.getRam());
        final  long bw = Integer.parseInt(appConst.getBw());

        logger.info("Creating Virtual Machines...");
        final  long numVms = Integer.parseInt(appConst.getNumOfVMS());
        for(int i = 0; i < numVms; i++){
            Vm vm = new VmSimple(mips, VM_PES).setRam(ram).setSize(size).setBw(bw);
            vmList.add(vm);
        }

        broker.submitVmList(vmList);
    }

    private Datacenter createDatacenter(){
        List<Host> hostList = new ArrayList<>();
        List<Pe> peList = new ArrayList<>();
        final  long mips = Integer.parseInt(appConst.getMips());

        final  long numPes = Integer.parseInt(appConst.getNumPES());
        for(int i = 0; i < numPes; i++){
            peList.add(new PeSimple(mips, new PeProvisionerSimple()));
        }

        final  long ram = Integer.parseInt(appConst.getRam());
        final  long storage = Integer.parseInt(appConst.getStorage());
        final  long bw = Integer.parseInt(appConst.getBw());

        logger.info("Creating Hosts...");
        final  long numHosts = Integer.parseInt(appConst.getNumOfHosts());
        for(int i = 0; i < numHosts; i++){
            Host host = new HostSimple(ram, bw, storage, peList);
            hostList.add(host);
        }

        logger.info("Allocating Virtual Machines to Hosts...");
        return new DatacenterSimple(simulation, hostList, new VmAllocationPolicyFirstFit());

    }

    private DatacenterBroker createBroker(){
        return new DatacenterBrokerSimple(simulation);
    }

}
