# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure("2") do |config|

    config.vm.box = "boxcutter/ubuntu1604"
    config.vm.provision "shell", path: "provision/node.sh", privileged: true
    config.vm.provision "shell", path: "provision/tools.sh", privileged: false
    config.vm.synced_folder "stacks/", "/home/vagrant/stacks", type: "rsync"
    config.vm.synced_folder "spring-boot/", "/home/vagrant/spring-boot", type: "rsync"

    # Swarm nodes
    (1..1).each do |number|
        config.vm.define "swarm#{number}" do |node|
            node.vm.network "private_network", ip: "192.168.99.20#{number}"
            node.vm.hostname = "swarm#{number}"
        end  
    end

    config.vm.provider "virtualbox" do |v|
        v.memory = 2048 
        v.cpus = 1
    end

end

