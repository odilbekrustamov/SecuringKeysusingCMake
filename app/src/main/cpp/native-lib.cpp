#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_exsample_securingkeysusingcmake_MainActivity_stringFromJNI(JNIEnv *env, jobject thiz) {
    std::string hello = "Hello from Jni";
    return env->NewStringUTF(hello.c_str());
}