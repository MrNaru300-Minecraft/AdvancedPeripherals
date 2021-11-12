# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/), and this project adheres
to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Fixed

- FormattedMessage formatting mistake
- [#203]Fixed Inventory Manager api, slot argument behaviour is now correct.
- [#219]Fixed that the inventory manager sees slot 0 as nil

### Added

- [#76]Added noteblock integration
- [#217]Added `getItemInHand`, `getFreeSlot`, `isSpaceAvailable` and `getEmptySpace` to the inventory manager.
- Added support for armor items. You can use the slots 100-103 to access armor items.
- Added more information to the `getPlayerPos` function. (Configurable)

## [0.7.3r] - 2021-10-13

### Removed

- Removed `listCraftableItems()` from the RSBridge because of some issues

### Added

- `getMaxItemDiskStorage()` to the RS Bridge
- `getMaxFluidDiskStorage()` to the RS Bridge
- `getMaxItemExternalStorage()` to the RS Bridge
- `getMaxFluidExternalStorage()` to the RS Bridge
- `getPattern()` to the RS Bridge
- `isItemCraftable()` to the RS Bridge
- `isItemCraftable()` to the ME Bridge
- Mekanism dynamic tank integration
- french translation

### Fixed

- [#177]Fixed that items after removing it from a chest using the inventory manager does not stack anymore.
- [#194]Fixed error spamming when using `getRequests()` from the colony integrator
- [#203]Fixed Inventory Manager api, slot argument behaviour is now correct.

## [0.7.2r] - 2021-09-06

### Added

- Mekanism waste barrel integration
- Create rotation speed controller and blaze burner integration

### Fixed

- Incorrect links to automata cores documentation
- Several ME bugs with import/export with partially full cases
- Crafting jobs [bug](https://github.com/Seniorendi/AdvancedPeripherals/issues/188)
- `lookAtBlock` now correctly shows tags
- Possible problem with crafting job race condition

## [0.7.1r] - 2021-08-23

### Fixed

- chunky turtle related issues
- RS and ME Bridge related issues
- redstone integrator block updates
- peripheral name of the player detector turtle