Akhil Snehal Modi

Create cloud simulators for evaluating executions of applications in cloud datacenters with different characteristics and deployment models.


About the Application:
In this homework, the primary aim is to replicate CloudSim Plus which is a full-featured, highly extensible modeling and simulation of Cloud Computing infrastructure and respective services. I try to do the same using various Cloudlet Utilization models and various Virtual Machine Allocation Policies by creating 3 datacenters.


Comparing VM Allocation Policy:
1. Best Fit VM Allocation Policy:
For allocating a VM, the Best Fit Allocation Policy chooses that host that has the most number of PEs in use which are enough for a VM.

2. Round Robin VM Allocation Policy:
For allocating a VM, the Round Robin Allocation Policy implements a circular method for choosing a host with the most suitable resources required for a VM. That means, when there is a new VM to be allocated, it moves to the next most suitable host for the new VM.

3. First Fit VM Allocation Policy:
For allocating a VM, the First Fit Allocation Policy allots the VM to the first host available with the suitable resources for the VM. This policy is highly time-efficient with a best-case scenario of O(1) and the worst case scenario of O(N), where N is the number of VMs.


Comparing Cloudlet Utilization Models:
1. Full Utilization Model:
According to the Full Utilization Model, a given cloudlet utilizes 100% of the resources that are available from the VM, at any given time.

2. Stochastic Utilization Model:
According to Stochastic Utilization Model, a given cloudlet uses a random amount of resources from the VM, at any given time.


RESULTS:

1. These are the results of the first Datacenter that I created by implementing Best Fit Allocation Policy along with the Full Utilization Model.


                                         SIMULATION RESULTS

Cloudlet|Status |DC|Host|Host PEs |VM|VM PEs   |CloudletLen|CloudletPEs|StartTime|FinishTime|ExecTime
      ID|       |ID|  ID|CPU cores|ID|CPU cores|         MI|  CPU cores|  Seconds|   Seconds| Seconds
-----------------------------------------------------------------------------------------------------
       0|SUCCESS| 1|   0|       30| 0|        1|       5000|          1|       12|        31|      19
       1|SUCCESS| 1|   1|       30| 1|        1|       5000|          1|       12|        31|      19
       2|SUCCESS| 1|   2|       30| 2|        1|       5000|          1|       12|        31|      19
       3|SUCCESS| 1|   3|       30| 3|        1|       5000|          1|       12|        31|      19
       4|SUCCESS| 1|   4|       30| 4|        1|       5000|          1|       12|        31|      19
       5|SUCCESS| 1|   5|       30| 5|        1|       5000|          1|       12|        31|      19
       6|SUCCESS| 1|   6|       30| 6|        1|       5000|          1|       12|        31|      19
       7|SUCCESS| 1|   7|       30| 7|        1|       5000|          1|       12|        31|      19
       8|SUCCESS| 1|   8|       30| 8|        1|       5000|          1|       12|        31|      19
       9|SUCCESS| 1|   9|       30| 9|        1|       5000|          1|       12|        31|      19
      10|SUCCESS| 1|  10|       30|10|        1|       5000|          1|       12|        31|      19
      11|SUCCESS| 1|  11|       30|11|        1|       5000|          1|       12|        31|      19
      12|SUCCESS| 1|  12|       30|12|        1|       5000|          1|       12|        31|      19
      13|SUCCESS| 1|  13|       30|13|        1|       5000|          1|       12|        31|      19
      14|SUCCESS| 1|  14|       30|14|        1|       5000|          1|       12|        31|      19
      15|SUCCESS| 1|  15|       30|15|        1|       5000|          1|       12|        31|      19
      16|SUCCESS| 1|  16|       30|16|        1|       5000|          1|       12|        31|      19
      17|SUCCESS| 1|  17|       30|17|        1|       5000|          1|       12|        31|      19
      18|SUCCESS| 1|  18|       30|18|        1|       5000|          1|       12|        31|      19
      19|SUCCESS| 1|  19|       30|19|        1|       5000|          1|       12|        31|      19
      20|SUCCESS| 1|  20|       30|20|        1|       5000|          1|       12|        31|      19
      21|SUCCESS| 1|  21|       30|21|        1|       5000|          1|       12|        31|      19
      22|SUCCESS| 1|  22|       30|22|        1|       5000|          1|       12|        31|      19
      23|SUCCESS| 1|  23|       30|23|        1|       5000|          1|       12|        31|      19
      24|SUCCESS| 1|  24|       30|24|        1|       5000|          1|       12|        31|      19
      25|SUCCESS| 1|  25|       30|25|        1|       5000|          1|       12|        31|      19
      26|SUCCESS| 1|  26|       30|26|        1|       5000|          1|       12|        31|      19
      27|SUCCESS| 1|  27|       30|27|        1|       5000|          1|       12|        31|      19
      28|SUCCESS| 1|  28|       30|28|        1|       5000|          1|       12|        31|      19
      29|SUCCESS| 1|  29|       30|29|        1|       5000|          1|       12|        31|      19
-----------------------------------------------------------------------------------------------------
DataCenter1 finished.



2. These are the results of the second datacenter that I created by implementing the Round-Robin VM Allocation Policy along wiht the Full Utilization Model.

                                         SIMULATION RESULTS

Cloudlet|Status |DC|Host|Host PEs |VM|VM PEs   |CloudletLen|CloudletPEs|StartTime|FinishTime|ExecTime
      ID|       |ID|  ID|CPU cores|ID|CPU cores|         MI|  CPU cores|  Seconds|   Seconds| Seconds
-----------------------------------------------------------------------------------------------------
       0|SUCCESS| 1|   0|       30| 0|        1|       5000|          1|       12|        31|      19
       1|SUCCESS| 1|   1|       30| 1|        1|       5000|          1|       12|        31|      19
       2|SUCCESS| 1|   2|       30| 2|        1|       5000|          1|       12|        31|      19
       3|SUCCESS| 1|   3|       30| 3|        1|       5000|          1|       12|        31|      19
       4|SUCCESS| 1|   4|       30| 4|        1|       5000|          1|       12|        31|      19
       5|SUCCESS| 1|   5|       30| 5|        1|       5000|          1|       12|        31|      19
       6|SUCCESS| 1|   6|       30| 6|        1|       5000|          1|       12|        31|      19
       7|SUCCESS| 1|   7|       30| 7|        1|       5000|          1|       12|        31|      19
       8|SUCCESS| 1|   8|       30| 8|        1|       5000|          1|       12|        31|      19
       9|SUCCESS| 1|   9|       30| 9|        1|       5000|          1|       12|        31|      19
      10|SUCCESS| 1|  10|       30|10|        1|       5000|          1|       12|        31|      19
      11|SUCCESS| 1|  11|       30|11|        1|       5000|          1|       12|        31|      19
      12|SUCCESS| 1|  12|       30|12|        1|       5000|          1|       12|        31|      19
      13|SUCCESS| 1|  13|       30|13|        1|       5000|          1|       12|        31|      19
      14|SUCCESS| 1|  14|       30|14|        1|       5000|          1|       12|        31|      19
      15|SUCCESS| 1|  15|       30|15|        1|       5000|          1|       12|        31|      19
      16|SUCCESS| 1|  16|       30|16|        1|       5000|          1|       12|        31|      19
      17|SUCCESS| 1|  17|       30|17|        1|       5000|          1|       12|        31|      19
      18|SUCCESS| 1|  18|       30|18|        1|       5000|          1|       12|        31|      19
      19|SUCCESS| 1|  19|       30|19|        1|       5000|          1|       12|        31|      19
      20|SUCCESS| 1|  20|       30|20|        1|       5000|          1|       12|        31|      19
      21|SUCCESS| 1|  21|       30|21|        1|       5000|          1|       12|        31|      19
      22|SUCCESS| 1|  22|       30|22|        1|       5000|          1|       12|        31|      19
      23|SUCCESS| 1|  23|       30|23|        1|       5000|          1|       12|        31|      19
      24|SUCCESS| 1|  24|       30|24|        1|       5000|          1|       12|        31|      19
      25|SUCCESS| 1|  25|       30|25|        1|       5000|          1|       12|        31|      19
      26|SUCCESS| 1|  26|       30|26|        1|       5000|          1|       12|        31|      19
      27|SUCCESS| 1|  27|       30|27|        1|       5000|          1|       12|        31|      19
      28|SUCCESS| 1|  28|       30|28|        1|       5000|          1|       12|        31|      19
      29|SUCCESS| 1|  29|       30|29|        1|       5000|          1|       12|        31|      19
-----------------------------------------------------------------------------------------------------
DataCenter2 finished.



3. These are the results of the third datacenter that I created by implementing the First Fit Policy along with the Stochastic Utilization Model.

                                         SIMULATION RESULTS

Cloudlet|Status |DC|Host|Host PEs |VM|VM PEs   |CloudletLen|CloudletPEs|StartTime|FinishTime|ExecTime
      ID|       |ID|  ID|CPU cores|ID|CPU cores|         MI|  CPU cores|  Seconds|   Seconds| Seconds
-----------------------------------------------------------------------------------------------------
       0|SUCCESS| 1|   0|       30| 0|        1|       5000|          1|       12|        42|      30
       1|SUCCESS| 1|   1|       30| 1|        1|       5000|          1|       12|        42|      30
       2|SUCCESS| 1|   2|       30| 2|        1|       5000|          1|       12|        42|      30
       3|SUCCESS| 1|   3|       30| 3|        1|       5000|          1|       12|        42|      30
       4|SUCCESS| 1|   4|       30| 4|        1|       5000|          1|       12|        42|      30
       5|SUCCESS| 1|   5|       30| 5|        1|       5000|          1|       12|        42|      30
       6|SUCCESS| 1|   6|       30| 6|        1|       5000|          1|       12|        42|      30
       7|SUCCESS| 1|   7|       30| 7|        1|       5000|          1|       12|        42|      30
       8|SUCCESS| 1|   8|       30| 8|        1|       5000|          1|       12|        42|      30
       9|SUCCESS| 1|   9|       30| 9|        1|       5000|          1|       12|        42|      30
      10|SUCCESS| 1|  10|       30|10|        1|       5000|          1|       12|        42|      30
      11|SUCCESS| 1|  11|       30|11|        1|       5000|          1|       12|        42|      30
      12|SUCCESS| 1|  12|       30|12|        1|       5000|          1|       12|        42|      30
      13|SUCCESS| 1|  13|       30|13|        1|       5000|          1|       12|        42|      30
      14|SUCCESS| 1|  14|       30|14|        1|       5000|          1|       12|        42|      30
      15|SUCCESS| 1|  15|       30|15|        1|       5000|          1|       12|        42|      30
      16|SUCCESS| 1|  16|       30|16|        1|       5000|          1|       12|        42|      30
      17|SUCCESS| 1|  17|       30|17|        1|       5000|          1|       12|        42|      30
      18|SUCCESS| 1|  18|       30|18|        1|       5000|          1|       12|        42|      30
      19|SUCCESS| 1|  19|       30|19|        1|       5000|          1|       12|        42|      30
      20|SUCCESS| 1|  20|       30|20|        1|       5000|          1|       12|        42|      30
      21|SUCCESS| 1|  21|       30|21|        1|       5000|          1|       12|        42|      30
      22|SUCCESS| 1|  22|       30|22|        1|       5000|          1|       12|        42|      30
      23|SUCCESS| 1|  23|       30|23|        1|       5000|          1|       12|        42|      30
      24|SUCCESS| 1|  24|       30|24|        1|       5000|          1|       12|        42|      30
      25|SUCCESS| 1|  25|       30|25|        1|       5000|          1|       12|        42|      30
      26|SUCCESS| 1|  26|       30|26|        1|       5000|          1|       12|        42|      30
      27|SUCCESS| 1|  27|       30|27|        1|       5000|          1|       12|        42|      30
      28|SUCCESS| 1|  28|       30|28|        1|       5000|          1|       12|        42|      30
      29|SUCCESS| 1|  29|       30|29|        1|       5000|          1|       12|        42|      30
-----------------------------------------------------------------------------------------------------
DataCenter3 finished.



Development Environment:
OS: Windows 10
IDE: IntelliJ IDEA Professional 2020.2.1
Java Version: 1.8.0_221
Gradle Version: 6.6.1
