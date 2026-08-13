            package com.google.ai.edge.litertlm;

            import kotlin.Metadata;
            import p000.I000II;
            
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\tR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/ai/edge/litertlm/Capabilities;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", "modelPath", "<init>", "(Ljava/lang/String;)V", "LOoiIlOl1iI;", "checkInitialized", "()V", "", "hasSpeculativeDecodingSupport", "()Z", "close", "", "lock", "Ljava/lang/Object;", "", "handle", "Ljava/lang/Long;", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class Capabilities implements AutoCloseable {
                private volatile Long handle;
                private final Object lock = new Object();

                public Capabilities(String str) {
/* 13 */            long jNativeCreateCapabilities = LiteRtLmJni.INSTANCE.nativeCreateCapabilities(str);
/* 21 */            if (jNativeCreateCapabilities == 0) {
/* 77 */                throw new LiteRtLmJniException("Failed to load capabilities for model: ".concat(str));
                    }
/* 27 */            this.handle = Long.valueOf(jNativeCreateCapabilities);
                }

                private final void checkInitialized() {
/* 3 */             if (this.handle != null) {
/* 5 */                 return;
                    }
/* 8 */             I000II.I001IO000("Capabilities instance is already closed.");
                }

                @Override
                public void close() {
                    synchronized (this.lock) {
/* 4 */                 checkInitialized();
/* 15 */                LiteRtLmJni.INSTANCE.nativeDeleteCapabilities(this.handle.longValue());
/* 19 */                this.handle = null;
                    }
                }

                public final boolean hasSpeculativeDecodingSupport() {
                    boolean zNativeHasSpeculativeDecodingSupport;
                    synchronized (this.lock) {
/* 4 */                 checkInitialized();
/* 15 */                zNativeHasSpeculativeDecodingSupport = LiteRtLmJni.INSTANCE.nativeHasSpeculativeDecodingSupport(this.handle.longValue());
                    }
/* 20 */            return zNativeHasSpeculativeDecodingSupport;
                }
            }
