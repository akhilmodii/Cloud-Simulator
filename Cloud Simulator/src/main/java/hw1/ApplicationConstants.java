package hw1;


public class ApplicationConstants {

    public static final String getLength(){
        return ApplicationConfigs.applicationconfig.getString("LENGTH");
    }

    public static final String getFileSize(){
        return ApplicationConfigs.applicationconfig.getString("FILESIZE");
    }

    public static final String getOutputSize(){
        return ApplicationConfigs.applicationconfig.getString("OUTPUTSIZE");
    }

    public static final String getMips(){
        return ApplicationConfigs.applicationconfig.getString("MIPS");
    }

    public static final String getSize(){
        return ApplicationConfigs.applicationconfig.getString("SIZE");
    }

    public static final String getRam(){
        return ApplicationConfigs.applicationconfig.getString("RAM");
    }

    public static final String getBw(){
        return ApplicationConfigs.applicationconfig.getString("BW");
    }

    public static final String getNumOfDatacenters(){
        return ApplicationConfigs.applicationconfig.getString("NUMBER_OF_DATACENTERS");
    }

    public static final String getNumOfCloudlets(){
        return ApplicationConfigs.applicationconfig.getString("NUMBER_OF_CLOUDLETS");
    }

    public static final String getNumOfVMS(){
        return ApplicationConfigs.applicationconfig.getString("NUMBER_OF_VMS");
    }

    public static final String getNumOfHosts(){
        return ApplicationConfigs.applicationconfig.getString("NUMBER_OF_HOSTS");
    }

    public static final String getNumPES(){
        return ApplicationConfigs.applicationconfig.getString("NUMBER_OF_PES");
    }

    public static final String getStorage(){
        return ApplicationConfigs.applicationconfig.getString("STORAGE");
    }

    public static final String getNetworkTopology(){
        return ApplicationConfigs.applicationconfig.getString("NETWORK_TOPOLOGY");
    }


}
