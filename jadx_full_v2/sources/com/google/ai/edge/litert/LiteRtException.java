            package com.google.ai.edge.litert;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/google/ai/edge/litert/LiteRtException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "status", "Lcom/google/ai/edge/litert/Status;", "message", "", "<init>", "(Lcom/google/ai/edge/litert/Status;Ljava/lang/String;)V", "code", "", "(ILjava/lang/String;)V", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 9 */     public final class LiteRtException extends Exception {
                private final Status status;

                public LiteRtException(int i, String str) {
/* 7 */             this(Status.INSTANCE.fromCode(i), str);
                }

/* 10 */        public LiteRtException(Status status, String str) {
/* 11 */            super(str);
                    this.status = status;
                }
            }
