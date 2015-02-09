#include <jni.h>
#include "com_sco_jni_MemoryAddress.h"
#include <stdio.h>
/*
 * Class:     com_sco_jni_MemoryAddress
 * Method:    printAddress
 * Signature: ([[[[I)V
 */
JNIEXPORT void JNICALL Java_com_sco_jni_MemoryAddress_printAddress___3_3_3_3I
  (JNIEnv* env, jobject obj, jobjectArray inArr){
    jsize len = (*env)->GetArrayLength(env,inArr);
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    //printf("Int Tuple Length => %d\n",len);
    for(i = 0; i < len; i++){
        jobjectArray inner_e = (*env)->GetObjectArrayElement(env,inArr,i);
        // jint* element = (*env)->GetIntArrayElements(env,inner_e,0);
        jobjectArray* inner_ptr = (jobjectArray)inner_e;
        jsize leni = (*env)->GetArrayLength(env,inner_e);

        printf("         [%d] : 0x%p\n",i,&inner_ptr[i]);
        //printf("Int Matrix Length => %d\n",leni);
        for(j = 0; j < leni; j++ ){
            jobjectArray tuple_e = (*env)->GetObjectArrayElement(env,inner_e,j);
            jobjectArray* tuple_ptr = (jobjectArray)tuple_e;
            jsize lenj = (*env)->GetArrayLength(env,tuple_e);
            printf("      [%d][%d] : 0x%p\n",i,j,&tuple_ptr[j]);
            //printf("Int Line %d length => %d\n",j,lenj);
            for( k = 0; k < lenj; k++ ){
                jobjectArray tuple_sub = (*env)->GetObjectArrayElement(env,tuple_e,k);
                jint* element = (*env)->GetIntArrayElements(env,tuple_sub,0);
                jsize lenk = (*env)->GetArrayLength(env,tuple_sub);
                jobjectArray* tuplesub_ptr = (jobjectArray)tuple_sub;
                printf("   [%d][%d][%d] : 0x%p\n",i,j,k,&tuplesub_ptr[k]);
                for( m = 0; m < lenk; m++){
                    printf("[%d][%d][%d][%d] = %d : 0x%p\n",i,j,k,m,element[m],&element[m]);
                }
            }
        }
    }
}

/*
 * Class:     com_sco_jni_MemoryAddress
 * Method:    printAddress
 * Signature: ([[[[S)V
 */
JNIEXPORT void JNICALL Java_com_sco_jni_MemoryAddress_printAddress___3_3_3_3S
  (JNIEnv* env, jobject obj, jobjectArray inArr){
    jsize len = (*env)->GetArrayLength(env,inArr);
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    //printf("Int Tuple Length => %d\n",len);
    for(i = 0; i < len; i++){
        jobjectArray inner_e = (*env)->GetObjectArrayElement(env,inArr,i);
        // jint* element = (*env)->GetIntArrayElements(env,inner_e,0);
        jobjectArray* inner_ptr = (jobjectArray)inner_e;
        jsize leni = (*env)->GetArrayLength(env,inner_e);

        printf("         [%d] : 0x%p\n",i,&inner_ptr[i]);
        //printf("Int Matrix Length => %d\n",leni);
        for(j = 0; j < leni; j++ ){
            jobjectArray tuple_e = (*env)->GetObjectArrayElement(env,inner_e,j);
            jobjectArray* tuple_ptr = (jobjectArray)tuple_e;
            jsize lenj = (*env)->GetArrayLength(env,tuple_e);
            printf("      [%d][%d] : 0x%p\n",i,j,&tuple_ptr[j]);
            //printf("Int Line %d length => %d\n",j,lenj);
            for( k = 0; k < lenj; k++ ){
                jobjectArray tuple_sub = (*env)->GetObjectArrayElement(env,tuple_e,k);
                jshort* element = (*env)->GetShortArrayElements(env,tuple_sub,0);
                jsize lenk = (*env)->GetArrayLength(env,tuple_sub);
                jobjectArray* tuplesub_ptr = (jobjectArray)tuple_sub;
                printf("   [%d][%d][%d] : 0x%p\n",i,j,k,&tuplesub_ptr[k]);
                for( m = 0; m < lenk; m++){
                    printf("[%d][%d][%d][%d] = %d : 0x%p\n",i,j,k,m,element[m],&element[m]);
                }
            }
        }
    }
}

/*
 * Class:     com_sco_jni_MemoryAddress
 * Method:    printAddress
 * Signature: ([[[[C)V
 */
JNIEXPORT void JNICALL Java_com_sco_jni_MemoryAddress_printAddress___3_3_3_3C
  (JNIEnv* env, jobject obj, jobjectArray inArr){
    jsize len = (*env)->GetArrayLength(env,inArr);
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    //printf("Int Tuple Length => %d\n",len);
    for(i = 0; i < len; i++){
        jobjectArray inner_e = (*env)->GetObjectArrayElement(env,inArr,i);
        // jint* element = (*env)->GetIntArrayElements(env,inner_e,0);
        jobjectArray* inner_ptr = (jobjectArray)inner_e;
        jsize leni = (*env)->GetArrayLength(env,inner_e);

        printf("         [%d] : 0x%p\n",i,&inner_ptr[i]);
        //printf("Int Matrix Length => %d\n",leni);
        for(j = 0; j < leni; j++ ){
            jobjectArray tuple_e = (*env)->GetObjectArrayElement(env,inner_e,j);
            jobjectArray* tuple_ptr = (jobjectArray)tuple_e;
            jsize lenj = (*env)->GetArrayLength(env,tuple_e);
            printf("      [%d][%d] : 0x%p\n",i,j,&tuple_ptr[j]);
            //printf("Int Line %d length => %d\n",j,lenj);
            for( k = 0; k < lenj; k++ ){
                jobjectArray tuple_sub = (*env)->GetObjectArrayElement(env,tuple_e,k);
                jchar* element = (*env)->GetCharArrayElements(env,tuple_sub,0);
                jsize lenk = (*env)->GetArrayLength(env,tuple_sub);
                jobjectArray* tuplesub_ptr = (jobjectArray)tuple_sub;
                printf("   [%d][%d][%d] : 0x%p\n",i,j,k,&tuplesub_ptr[k]);
                for( m = 0; m < lenk; m++){
                    printf("[%d][%d][%d][%d] = %c : 0x%p\n",i,j,k,m,element[m],&element[m]);
                }
            }
        }
    }
}

/*
 * Class:     com_sco_jni_MemoryAddress
 * Method:    printAddress
 * Signature: ([[[[J)V
 */
JNIEXPORT void JNICALL Java_com_sco_jni_MemoryAddress_printAddress___3_3_3_3J
  (JNIEnv* env, jobject obj, jobjectArray inArr){
    jsize len = (*env)->GetArrayLength(env,inArr);
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    //printf("Int Tuple Length => %d\n",len);
    for(i = 0; i < len; i++){
        jobjectArray inner_e = (*env)->GetObjectArrayElement(env,inArr,i);
        // jint* element = (*env)->GetIntArrayElements(env,inner_e,0);
        jobjectArray* inner_ptr = (jobjectArray)inner_e;
        jsize leni = (*env)->GetArrayLength(env,inner_e);

        printf("         [%d] : 0x%p\n",i,&inner_ptr[i]);
        //printf("Int Matrix Length => %d\n",leni);
        for(j = 0; j < leni; j++ ){
            jobjectArray tuple_e = (*env)->GetObjectArrayElement(env,inner_e,j);
            jobjectArray* tuple_ptr = (jobjectArray)tuple_e;
            jsize lenj = (*env)->GetArrayLength(env,tuple_e);
            printf("      [%d][%d] : 0x%p\n",i,j,&tuple_ptr[j]);
            //printf("Int Line %d length => %d\n",j,lenj);
            for( k = 0; k < lenj; k++ ){
                jobjectArray tuple_sub = (*env)->GetObjectArrayElement(env,tuple_e,k);
                jlong* element = (*env)->GetLongArrayElements(env,tuple_sub,0);
                jsize lenk = (*env)->GetArrayLength(env,tuple_sub);
                jobjectArray* tuplesub_ptr = (jobjectArray)tuple_sub;
                printf("   [%d][%d][%d] : 0x%p\n",i,j,k,&tuplesub_ptr[k]);
                for( m = 0; m < lenk; m++){
                    printf("[%d][%d][%d][%d] = %c : 0x%p\n",i,j,k,m,element[m],&element[m]);
                }
            }
        }
    }
}

/*
 * Class:     com_sco_jni_MemoryAddress
 * Method:    printAddress
 * Signature: ([[[[Z)V
 */
JNIEXPORT void JNICALL Java_com_sco_jni_MemoryAddress_printAddress___3_3_3_3Z
  (JNIEnv* env, jobject obj, jobjectArray inArr){
    jsize len = (*env)->GetArrayLength(env,inArr);
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    //printf("Int Tuple Length => %d\n",len);
    for(i = 0; i < len; i++){
        jobjectArray inner_e = (*env)->GetObjectArrayElement(env,inArr,i);
        // jint* element = (*env)->GetIntArrayElements(env,inner_e,0);
        jobjectArray* inner_ptr = (jobjectArray)inner_e;
        jsize leni = (*env)->GetArrayLength(env,inner_e);

        printf("         [%d] : 0x%p\n",i,&inner_ptr[i]);
        //printf("Int Matrix Length => %d\n",leni);
        for(j = 0; j < leni; j++ ){
            jobjectArray tuple_e = (*env)->GetObjectArrayElement(env,inner_e,j);
            jobjectArray* tuple_ptr = (jobjectArray)tuple_e;
            jsize lenj = (*env)->GetArrayLength(env,tuple_e);
            printf("      [%d][%d] : 0x%p\n",i,j,&tuple_ptr[j]);
            //printf("Int Line %d length => %d\n",j,lenj);
            for( k = 0; k < lenj; k++ ){
                jobjectArray tuple_sub = (*env)->GetObjectArrayElement(env,tuple_e,k);
                jboolean* element = (*env)->GetBooleanArrayElements(env,tuple_sub,0);
                jsize lenk = (*env)->GetArrayLength(env,tuple_sub);
                jobjectArray* tuplesub_ptr = (jobjectArray)tuple_sub;
                printf("   [%d][%d][%d] : 0x%p\n",i,j,k,&tuplesub_ptr[k]);
                for( m = 0; m < lenk; m++){
                    printf("[%d][%d][%d][%d] = %c : 0x%p\n",i,j,k,m,element[m],&element[m]);
                }
            }
        }
    }
}

/*
 * Class:     com_sco_jni_MemoryAddress
 * Method:    printAddress
 * Signature: ([[[[B)V
 */
JNIEXPORT void JNICALL Java_com_sco_jni_MemoryAddress_printAddress___3_3_3_3B
  (JNIEnv* env, jobject obj, jobjectArray inArr){
    jsize len = (*env)->GetArrayLength(env,inArr);
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    //printf("Int Tuple Length => %d\n",len);
    for(i = 0; i < len; i++){
        jobjectArray inner_e = (*env)->GetObjectArrayElement(env,inArr,i);
        // jint* element = (*env)->GetIntArrayElements(env,inner_e,0);
        jobjectArray* inner_ptr = (jobjectArray)inner_e;
        jsize leni = (*env)->GetArrayLength(env,inner_e);

        printf("         [%d] : 0x%p\n",i,&inner_ptr[i]);
        //printf("Int Matrix Length => %d\n",leni);
        for(j = 0; j < leni; j++ ){
            jobjectArray tuple_e = (*env)->GetObjectArrayElement(env,inner_e,j);
            jobjectArray* tuple_ptr = (jobjectArray)tuple_e;
            jsize lenj = (*env)->GetArrayLength(env,tuple_e);
            printf("      [%d][%d] : 0x%p\n",i,j,&tuple_ptr[j]);
            //printf("Int Line %d length => %d\n",j,lenj);
            for( k = 0; k < lenj; k++ ){
                jobjectArray tuple_sub = (*env)->GetObjectArrayElement(env,tuple_e,k);
                jbyte* element = (*env)->GetByteArrayElements(env,tuple_sub,0);
                jsize lenk = (*env)->GetArrayLength(env,tuple_sub);
                jobjectArray* tuplesub_ptr = (jobjectArray)tuple_sub;
                printf("   [%d][%d][%d] : 0x%p\n",i,j,k,&tuplesub_ptr[k]);
                for( m = 0; m < lenk; m++){
                    printf("[%d][%d][%d][%d] = %c : 0x%p\n",i,j,k,m,element[m],&element[m]);
                }
            }
        }
    }
}
/*
 * Class:     com_sco_jni_MemoryAddress
 * Method:    printAddress
 * Signature: ([[[I)V
 */
JNIEXPORT void JNICALL Java_com_sco_jni_MemoryAddress_printAddress___3_3_3I
  (JNIEnv* env, jobject obj, jobjectArray inArr){
    jsize len = (*env)->GetArrayLength(env,inArr);
    int i = 0;
    int j = 0;
    int k = 0;
    //printf("Int Tuple Length => %d\n",len);
    for(i = 0; i < len; i++){
        jobjectArray inner_e = (*env)->GetObjectArrayElement(env,inArr,i);
        // jint* element = (*env)->GetIntArrayElements(env,inner_e,0);
        jobjectArray* inner_ptr = (jobjectArray)inner_e;
        jsize leni = (*env)->GetArrayLength(env,inner_e);

        printf("      [%d] : 0x%p\n",i,&inner_ptr[i]);
        //printf("Int Matrix Length => %d\n",leni);
        for(j = 0; j < leni; j++ ){
            jobjectArray tuple_e = (*env)->GetObjectArrayElement(env,inner_e,j);
            jint* element = (*env)->GetIntArrayElements(env,tuple_e,0);
            jsize lenj = (*env)->GetArrayLength(env,tuple_e);
            jobjectArray* tuple_ptr = (jobjectArray)tuple_e;
            printf("   [%d][%d] : 0x%p\n",i,j,&tuple_ptr[j]);
            //printf("Int Line %d length => %d\n",j,lenj);
            for( k = 0; k < lenj; k++ ){
                printf("[%d][%d][%d] = %d : 0x%p\n",i,j,k,element[k],&element[k]);
            }
        }
    }
}

/*
 * Class:     com_sco_jni_MemoryAddress
 * Method:    printAddress
 * Signature: ([[I)V
 */
JNIEXPORT void JNICALL Java_com_sco_jni_MemoryAddress_printAddress___3_3I
  (JNIEnv* env, jobject obj, jobjectArray inArr){
    jsize len = (*env)->GetArrayLength(env,inArr);
    int i = 0;
    int j = 0;
    //printf("Int Matrix Length => %d\n",len);
    for(i = 0; i < len; i++){
        jobjectArray inner_e = (*env)->GetObjectArrayElement(env,inArr,i);
        jint* element = (*env)->GetIntArrayElements(env,inner_e,0);
        jsize len1 = (*env)->GetArrayLength(env,inner_e);
        jobjectArray* inner_ptr = (jobjectArray)inner_e;
        printf("   [%d] : 0x%p\n",i,&inner_ptr[i]);
        //printf("Int Line %d length => %d\n",i,len1);
        //jobjectArray* inner_e = (*env)->GetObjectArrayElement(env,element,0);
        for( j = 0; j < len1; j++ ){
            printf("[%d][%d] = %d : 0x%p\n",i,j,element[j],&element[j]);
        }
    }
}

/*
 * Class:     com_sco_jni_MemoryAddress
 * Method:    printAddress
 * Signature: ([[C)V
 */
JNIEXPORT void JNICALL Java_com_sco_jni_MemoryAddress_printAddress___3_3C
  (JNIEnv* env, jobject obj, jobjectArray inArr){
    jsize len = (*env)->GetArrayLength(env,inArr);
    int i = 0;
    int j = 0;
    //printf("Char Matrix Length => %d\n",len);
    for(i = 0; i < len; i++){
        jobjectArray inner_e = (*env)->GetObjectArrayElement(env,inArr,i);
        jchar* element = (*env)->GetCharArrayElements(env,inner_e,0);
        jsize len1 = (*env)->GetArrayLength(env,inner_e);
        jobjectArray* inner_ptr = (jobjectArray)inner_e;
        printf("   [%d] : 0x%p\n",i,&inner_ptr[i]);
        //printf("Char Line %d length => %d\n",i,len1);
        //jobjectArray* inner_e = (*env)->GetObjectArrayElement(env,element,0);
        for( j = 0; j < len1; j++ ){
            printf("[%d][%d] = %c : 0x%p\n",i,j,element[j],&element[j]);
        }
    }
}

/*
 * Class:     com_sco_jni_MemoryAddress
 * Method:    printAddress
 * Signature: ([I)V
 */
JNIEXPORT void JNICALL Java_com_sco_jni_MemoryAddress_printAddress___3I
  (JNIEnv* env, jobject obj, jintArray inArr){
    jsize len = (*env)->GetArrayLength(env,inArr);
    int i = 0;
    jint* item = (*env)->GetIntArrayElements(env,inArr,0);

    //printf("Int Line Length : %d\n",len);

    for( i = 0; i < len; i++ ){
        printf("[%d] = %d : %p\n",i,item[i],&item[i]);
    }
}

/*
 * Class:     com_sco_jni_MemoryAddress
 * Method:    printAddress
 * Signature: ([C)V
 */
JNIEXPORT void JNICALL Java_com_sco_jni_MemoryAddress_printAddress___3C
  (JNIEnv* env, jobject obj, jcharArray inArr){
    jsize len = (*env)->GetArrayLength(env,inArr);
    int i = 0;
    jchar* item = (*env)->GetCharArrayElements(env,inArr,0);

    //printf("Char Line Length : %d\n",len);

    for( i = 0; i < len; i++ ){
        printf("[%d] = %d : %p\n",i,item[i],&item[i]);
    }
}

/*
 * Class:     com_sco_jni_MemoryAddress
 * Method:    printAddress
 * Signature: (Z)V
 */
JNIEXPORT void JNICALL Java_com_sco_jni_MemoryAddress_printAddress__Z
  (JNIEnv* env, jobject obj, jboolean input){
    printf("Input Boolean: %d: %p \n",input,&input);
}

/*
 * Class:     com_sco_jni_MemoryAddress
 * Method:    printAddress
 * Signature: (B)V
 */
JNIEXPORT void JNICALL Java_com_sco_jni_MemoryAddress_printAddress__B
  (JNIEnv* env, jobject obj, jbyte input){
    printf("Input Byte: %d: %p \n",input,&input);
}

/*
 * Class:     com_sco_jni_MemoryAddress
 * Method:    printAddress
 * Signature: (S)V
 */
JNIEXPORT void JNICALL Java_com_sco_jni_MemoryAddress_printAddress__S
  (JNIEnv* env, jobject obj, jshort input){
    printf("Input Short: %d: %p \n",input,&input);
}

/*
 * Class:     com_sco_jni_MemoryAddress
 * Method:    printAddress
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_sco_jni_MemoryAddress_printAddress__I
  (JNIEnv* env, jobject obj, jint input){
    printf("Input Int: %d: %p \n",input,&input);
}

/*
 * Class:     com_sco_jni_MemoryAddress
 * Method:    printAddress
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_com_sco_jni_MemoryAddress_printAddress__J
  (JNIEnv* env, jobject obj, jlong input){
    printf("Input Long: %d: %p \n",input,&input);
}

/*
 * Class:     com_sco_jni_MemoryAddress
 * Method:    printAddress
 * Signature: (F)V
 */
JNIEXPORT void JNICALL Java_com_sco_jni_MemoryAddress_printAddress__F
  (JNIEnv* env, jobject obj, jfloat input){
    printf("Input Float: %f: %p \n",input,&input);
}

/*
 * Class:     com_sco_jni_MemoryAddress
 * Method:    printAddress
 * Signature: (D)V
 */
JNIEXPORT void JNICALL Java_com_sco_jni_MemoryAddress_printAddress__D
  (JNIEnv* env, jobject obj, jdouble input){
    printf("Input Double: %f: %p \n",input,&input);
}

/*
 * Class:     com_sco_jni_MemoryAddress
 * Method:    printAddress
 * Signature: (C)V
 */
JNIEXPORT void JNICALL Java_com_sco_jni_MemoryAddress_printAddress__C
  (JNIEnv* env, jobject obj, jchar input){
    printf("Input Char: %c: %p \n",input,&input);
}
