# PiglinTag
Adds an easy way to add armor items to the piglin brain so that they will no longer be aggressive

How to add items:
```
add a tag under data\piglintag\tags\items\piglin_not_attack_items.json
Inside the tag:
{
  "replace": false,
  "values": [
    "modid:itemid",
    "modid:itemid2",
    ...
  ]
}
```
To include it in your project, add this to your build.gradle:
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
dependencies {
    modImplementation 'com.github.Globox1997:piglintag:LATEST'
    include 'com.github.Globox1997:piglintag:LATEST'
}
```
Where `LATEST` is the latest tag under the releases tab.