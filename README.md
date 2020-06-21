# PackagedAuto
PackagedAuto is an Applied Energistics 2 addon that uses "packages" to allow autocrafting with more than 9 items.


# Fluid Handling Experiments
This branch is experimenting with adding fluid handling to PackagedAuto

## Packager
Consumes fluid from containers (EnderIO Tanks only at the moment) and adds fluid amount to recipe packages, returning empty containers to the ME network.

## Unpackager
Inserts fluid from contained recipe package into adjacent fluid inventory, and blocking mode considers the target fluid inventory.

