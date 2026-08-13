            package com.google.ai.edge.litertlm;

            import com.google.ai.edge.litertlm.LiteRtLmJni;
            import java.util.List;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.Metadata;
            import p000.I000II;
            import p000.IlIi0I0;
            
            @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001!B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001b\u0010\u000e\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/google/ai/edge/litertlm/Session;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", "handle", "<init>", "(J)V", "LOoiIlOl1iI;", "checkIsAlive", "()V", "close", "", "Lcom/google/ai/edge/litertlm/InputData;", "inputData", "runPrefill", "(Ljava/util/List;)V", "", "runDecode", "()Ljava/lang/String;", "generateContent", "(Ljava/util/List;)Ljava/lang/String;", "Lcom/google/ai/edge/litertlm/ResponseCallback;", "responseCallback", "generateContentStream", "(Ljava/util/List;Lcom/google/ai/edge/litertlm/ResponseCallback;)V", "cancelProcess", "J", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_isAlive", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "isAlive", "()Z", "JniInferenceCallbackImpl", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class Session implements AutoCloseable {
                private final AtomicBoolean _isAlive = new AtomicBoolean(true);
                private final long handle;

                @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/ai/edge/litertlm/Session$JniInferenceCallbackImpl;", "Lcom/google/ai/edge/litertlm/LiteRtLmJni$JniInferenceCallback;", "Lcom/google/ai/edge/litertlm/ResponseCallback;", "callback", "<init>", "(Lcom/google/ai/edge/litertlm/Session;Lcom/google/ai/edge/litertlm/ResponseCallback;)V", "", "response", "LOoiIlOl1iI;", "onNext", "(Ljava/lang/String;)V", "onDone", "()V", "", "statusCode", "message", "onError", "(ILjava/lang/String;)V", "Lcom/google/ai/edge/litertlm/ResponseCallback;", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public final class JniInferenceCallbackImpl implements LiteRtLmJni.JniInferenceCallback {
                    private final ResponseCallback callback;

                    public JniInferenceCallbackImpl(ResponseCallback responseCallback) {
/* 6 */                 this.callback = responseCallback;
                    }

                    @Override
                    public void onDone() {
/* 3 */                 this.callback.onDone();
                    }

                    @Override
                    public void onError(int statusCode, String message) {
/* 1 */                 ResponseCallback responseCallback = this.callback;
/* 4 */                 if (statusCode == 1) {
/* 11 */                    responseCallback.onError(new CancellationException(message));
                        } else {
/* 28 */                    responseCallback.onError(new LiteRtLmJniException(IlIi0I0.I000OiO(statusCode, "Status Code: ", ". Message: ", message)));
                        }
                    }

                    @Override
                    public void onNext(String response) {
/* 3 */                 this.callback.onNext(response);
                    }
                }

                public Session(long j) {
/* 4 */             this.handle = j;
                }

                private final void checkIsAlive() {
/* 5 */             if (isAlive()) {
/* 7 */                 return;
                    }
/* 10 */            I000II.I001IO000("Session is not alive.");
                }

                public final void cancelProcess() {
/* 1 */             checkIsAlive();
/* 8 */             LiteRtLmJni.INSTANCE.nativeCancelProcess(this.handle);
                }

                @Override
                public void close() {
/* 9 */             if (this._isAlive.compareAndSet(true, false)) {
/* 15 */                LiteRtLmJni.INSTANCE.nativeDeleteSession(this.handle);
                    } else {
/* 21 */                I000II.I001IO000("Session is closed already.");
                    }
                }

                public final String generateContent(List<? extends InputData> inputData) {
/* 1 */             checkIsAlive();
/* 19 */            return LiteRtLmJni.INSTANCE.nativeGenerateContent(this.handle, (InputData[]) inputData.toArray(new InputData[0]));
                }

                public final void generateContentStream(List<? extends InputData> inputData, ResponseCallback responseCallback) {
/* 1 */             checkIsAlive();
/* 24 */            LiteRtLmJni.INSTANCE.nativeGenerateContentStream(this.handle, (InputData[]) inputData.toArray(new InputData[0]), new JniInferenceCallbackImpl(responseCallback));
                }

                public final boolean isAlive() {
/* 3 */             return this._isAlive.get();
                }

                public final String runDecode() {
/* 1 */             checkIsAlive();
/* 8 */             return LiteRtLmJni.INSTANCE.nativeRunDecode(this.handle);
                }

                public final void runPrefill(List<? extends InputData> inputData) {
/* 1 */             checkIsAlive();
/* 19 */            LiteRtLmJni.INSTANCE.nativeRunPrefill(this.handle, (InputData[]) inputData.toArray(new InputData[0]));
                }
            }
