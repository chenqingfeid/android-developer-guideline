# Summary

* [序言](README.md)

## Java
* 新特性
    * [Java SE 10](content/java/features/java-se-10/README.md)
    * [Java SE 9](content/java/features/java-se-9/README.md)
    * [Java SE 8](content/java/features/java-se-8/README.md)
    * [Java SE 7](content/java/features/java-se-7/README.md)
    * [Java SE 6](content/java/features/java-se-6/README.md)
    * [J2SE 5.0](content/java/features/j2se-5.0/README.md)
    * [J2SE 1.4](content/java/features/j2se-1.4/README.md)
* [Java 虚拟机](content/java/jvm/README.md)
    * class 文件格式
    * 数据类型
    * 原始类型和值
    * 引用类型和值
    * 运行时数据区
        * 寄存器
        * 虚拟机栈
        * 堆
        * 方法区
        * 运行时常量池
        * Native 方法栈
    * 帧
        * 局部变量
        * 操作数栈
        * 动态链接
    * 对象的表示
    * 浮点运算
    * 特殊方法
    * 异常
    * 指令集
    * 类库
* [Java Native Interface](content/java/jni/README.md)

## Kotlin
* 新特性
    * [Kotlin 1.2](content/kotlin/features/1.2/README.md)
    * [Kotlin 1.1](content/kotlin/features/1.1/README.md)
* Kotlin/Native
    * [konan](content/kotlin/konan.md)

## Android
* 新特性
    * [Android 9.0 - Pie](content/android/features/9.0/README.md)
    * [Android 8.0 - Oreo](content/android/features/8.0/README.md)
    * [Android 7.0 - Nougat](content/android/features/7.0/README.md)
    * [Android 6.0 - Marshmallow](content/android/features/6.0/README.md)
    * [Android 5.0 - Lollipop](content/android/features/5.0/README.md)
    * [Android 4.4 - KitKat](content/android/features/4.4/README.md)
* [系统](content/android/system/README.md)
    * [Linux Kernel](content/android/system/kernel/README.md)
        * [IPC](content/android/system/kernel/ipc.md)
    * [Hardware Abstraction Layer](content/android/system/hal/README.md)
        * [Audio](content/android/system/hal/audio.md)
        * [Bluetooth](content/android/system/hal/bluetooth.md)
        * [Camera](content/android/system/hal/camera.md)
        * [Sensors](content/android/system/hal/sensors.md)
    * [Runtime](content/android/system/runtime/README.md)
        * [Dalvik VM](content/android/system/runtime/dalvik.md)
        * [ART](content/android/system/runtime/art.md)
    * [Framework](content/android/system/framework/README.md)
        * [View System](content/android/system/framework/view-system.md)
        * [Animations and Transitions](content/android/system/framework/animations-and-transitions.md)
        * [Graphics](content/android/system/framework/graphics.md)
        * [Content Providers](content/android/system/framework/content-providers.md)
        * [Activity Manager](content/android/system/framework/activity-manager.md)
        * [Input Manager](content/android/system/framework/input-manager.md)
        * [Window Manager](content/android/system/framework/window-manager.md)
        * [Notification Manager](content/android/system/framework/notification-manager.md)
        * [Package Manager](content/android/system/framework/package-manager.md)
        * [Telephony Manager](content/android/system/framework/telephony-manager.md)
        * [Location Manager](content/android/system/framework/location-manager.md)
        * [Resource Manager](content/android/system/framework/resource-manager.md)
    * [NDK](content/android/system/ndk/README.md)
        * [Java Native Interface](content/android/system/ndk/jni.md)
        * [Building](content/android/system/ndk/building.md)
        * [CPUs and Architectures](content/android/system/ndk/cpus-and-architectures.md)
        * [Debugging](content/android/system/ndk/debugging.md)
* 安全
    * [Application Sandbox](content/android/security/app-sandbox.md)
    * [Application Signing](content/android/security/app-signing/README.md)
        * [APK Signature Scheme V3](content/android/security/apk-signing/v3.md)
        * [APK Signature Scheme V2](content/android/security/apk-signing/v2.md)
    * [Authentication](content/android/security/authentication/README.md)
        * [Fingerpring HAL](content/android/security/authentication/fingerprint-hal.md)
        * [Gatekeeper](content/android/security/authentication/gatekeeper.md)
    * [Biometric Unlock](content/android/security/biometric/README.md)
        * [Measuring Biometric Security](content/android/security/biometric/measuring.md)
    * [Hardware-backed Key Store](content/android/security/keystore/README.md)
    * [Trusty TEE](content/android/security/trusty/README.md)
    * [Encryption](content/android/security/encryption/README.md)
        * [File-Based Encryption](content/android/security/encryption/file-based.md)
        * [Full-Disk Encryption](content/android/security/encryption/full-disk.md)
        * [Metadata Encryption](content/android/security/encryption/metadata.md)
    * [SELinux](content/android/security/selinux/README.md)
    * [Verified Boot](content/android/security/verified-boot/README.md)

## Garbage Collection
* [内存管理](content/garbage-collection/memory-management/README.md)
    * [手动管理](content/garbage-collection/memory-management/manual.md)
    * [自动管理](content/garbage-collection/memory-management/automated.md)
* [Garbage Collection in Java](content/garbage-collection/gc-in-java/README.md)
    * [分段和压缩](content/garbage-collection/gc-in-java/fragmenting-and-compacting.md)
    * [代际假设](content/garbage-collection/gc-in-java/generational-hypothesis.md)
    * [内存池](content/garbage-collection/gc-in-java/memory-pools.md)
    * [Minor GC](content/garbage-collection/gc-in-java/minor-gc.md)
    * [Major GC](content/garbage-collection/gc-in-java/major-gc.md)
    * [Full GC](content/garbage-collection/gc-in-java/full-gc.md)
* [Garbage Collection in Android](content/garbage-collection/gc-in-android/README.md)
    * [Dalvik](content/garbage-collection/gc-in-android/dalvik.md)
    * [ART](content/garbage-collection/gc-in-android/art.md)
* [GC 算法](content/garbage-collection/gc-algorithms/README.md)
    * [标记可达对象](content/garbage-collection/gc-algorithms/marking-reachable-objects.md)
    * [移除无用对象](content/garbage-collection/gc-algorithms/removing-unused-objects.md)
* [GC 实现](content/garbage-collection/gc-implementations/README.md)
    * [串行 GC](content/garbage-collection/gc-implementations/serial-gc.md)
    * [并行 GC](content/garbage-collection/gc-implementations/parallel-gc.md)
    * [并发标记清除](content/garbage-collection/gc-implementations/concurrent-mark-and-sweep.md)
    * [G1 - Garbage First](content/garbage-collection/gc-implementations/g1.md)
    * [Shenandoah](content/garbage-collection/gc-implementations/shenandoah.md)

## Build Tools
* [Android Gradle Plugin](content/build-tools/android-gradle-plugin/README.md)
    * [Transform API](content/build-tools/android-gradle-plugin/transform-api.md)
    * [Instant Run](content/build-tools/android-gradle-plugin/instant-run.md)

## Hybrid
* WebView
* Flutter
* React Native
* Weex

## 设计模式
* 创造型
    * [Abstract Factory](content/design-pattern/abstract-factory.md)
    * [Builder](content/design-pattern/builder.md)
    * [Factory Method](content/design-pattern/factory-method.md)
    * [Object Pool](content/design-pattern/object-pool.md)
    * [Prototype](content/design-pattern/prototype.md)
    * [Singleton](content/design-pattern/singleton.md)
* 结构型
    * [Adapter](content/design-pattern/adapter.md)
    * [Bridge](content/design-pattern/bridge.md)
    * [Composite](content/design-pattern/composite.md)
    * [Decorator](content/design-pattern/decorator.md)
    * [Facade](content/design-pattern/facade.md)
    * [Flyweight](content/design-pattern/flyweight.md)
    * [Private Class Data](content/design-pattern/private-class-data.md)
    * [Proxy](content/design-pattern/proxy.md)
* 行为型
    * [Chain of Responsibility](content/design-pattern/chain-of-responsibility.md)
    * [Command](content/design-pattern/command.md)
    * [Interpreter](content/design-pattern/interpreter.md)
    * [Iterator](content/design-pattern/iterator.md)
    * [Mediator](content/design-pattern/mediator.md)
    * [Memento](content/design-pattern/memento.md)
    * [Null Object](content/design-pattern/null-object.md)
    * [Observer](content/design-pattern/observer.md)
    * [State](content/design-pattern/state.md)
    * [Strategy](content/design-pattern/strategy.md)
    * [Template Method](content/design-pattern/template-method.md)
    * [Visitor](content/design-pattern/visitor.md)

## Reverse Engineering
* 调试 Release APK

