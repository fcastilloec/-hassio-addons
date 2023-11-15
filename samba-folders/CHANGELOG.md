# Changelog

## 3.1.0

- Use the new Home Assistant folder for the `config` share
- Add support for accessing public add-on configurations

## 3.0.0

- Temporary remove access to add-on config shares, until Supervisor 2023.11.2 has been rolled out stable
- Revert `config` share name change to avoid user facing change
- Adjust location of Home Assistant config to match latest dev/beta Supervisor
- Migrate add-on layout to S6 Overlay

## 2.0.0

- The `config` share has been renamed to `homeassistant` to match upstream changes.
- Add support for accessing public add-on configurations
- Update to Alpine 3.18
- Adds HEALTCHECK support

## 1.0.2

- Enable IPv6 ULA and IPv4 link-local addresses by default

## 1.0.1

- Update to Alpine 3.17

## 1.0.0

Initial release
