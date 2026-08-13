            package com.google.ai.edge.litert;

            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.Metadata;
            import p000.I000II;
            
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H$¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/google/ai/edge/litert/JniHandle;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", "handle", "<init>", "(J)V", "LOoiIlOl1iI;", "assertNotDestroyed", "()V", "destroy", "close", "J", "getHandle$third_party_odml_litert_litert_kotlin_litert_kotlin_api", "()J", "Ljava/util/concurrent/atomic/AtomicBoolean;", "destroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public abstract class JniHandle implements AutoCloseable {
                private final AtomicBoolean destroyed = new AtomicBoolean(false);
                private final long handle;

                public JniHandle(long j) {
/* 4 */             this.handle = j;
                }

                public final void assertNotDestroyed() {
/* 7 */             if (this.destroyed.get()) {
/* 12 */                I000II.I001IO000("The handle has been destroyed.");
                    }
                }

                @Override
                public final void close() {
/* 9 */             if (this.destroyed.compareAndSet(false, true)) {
/* 11 */                destroy();
                    }
                }

                public abstract void destroy();

                public final long getHandle() {
/* 1 */             return this.handle;
                }
            }
