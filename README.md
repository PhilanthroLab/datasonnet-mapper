# DataSonnet

## Build and Versioning notes

The version in the POM should always be a SNAPSHOT version. That is the version that will be published
on every push to the main branch (currently `master`).

All other branches will be versioned purely by their name (with slashes replaced by hyphens) followed by `-SNAPSHOT`.

Builds triggered on individual commits will have the version `commit-{HASH}-SNAPSHOT`.

Tags that start with `v` will be published with whatever the exact tag is (without the v).

To make a release where the SNAPSHOT version is `X.Y.Z-SNAPSHOT`
    - tag the commit being released with `vX.Y.Z` and push.
    - update the POM version to the next SNAPSHOT release by ticking one of the version numbers and make a PR into the main branch.