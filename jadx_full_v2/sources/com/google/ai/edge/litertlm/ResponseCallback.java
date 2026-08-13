            package com.google.ai.edge.litertlm;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/google/ai/edge/litertlm/ResponseCallback;", "", "", "response", "LOoiIlOl1iI;", "onNext", "(Ljava/lang/String;)V", "onDone", "()V", "", "throwable", "onError", "(Ljava/lang/Throwable;)V", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 18 */    public interface ResponseCallback {
/* 19 */        default void onDone() {
                }

/* 28 */        default void onError(Throwable throwable) {
                }

/* 28 */        default void onNext(String response) {
                }
            }
