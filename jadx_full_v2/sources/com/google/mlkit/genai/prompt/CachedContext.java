            package com.google.mlkit.genai.prompt;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u000b\u001a\u00020\fH\u0096\u0080\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/google/mlkit/genai/prompt/CachedContext;", "", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "Companion", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 2 */     public final class CachedContext {

                public static final Companion INSTANCE = new Companion(null);
                private final String zza;

                public CachedContext(String str, DefaultConstructorMarker defaultConstructorMarker) {
/* 4 */             this.zza = str;
                }

                public boolean equals(Object other) {
/* 1 */             if (this == other) {
/* 3 */                 return true;
                    }
/* 7 */             if (other instanceof CachedContext) {
/* 17 */                return O0000Ioio00.I0000O(this.zza, ((CachedContext) other).zza);
                    }
/* 9 */             return false;
                }

                public final String getZza() {
/* 1 */             return this.zza;
                }

                public int hashCode() {
/* 3 */             return this.zza.hashCode();
                }

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\b"}, d2 = {"Lcom/google/mlkit/genai/prompt/CachedContext$Companion;", "", "<init>", "()V", "create", "Lcom/google/mlkit/genai/prompt/CachedContext;", "name", "", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public static final CachedContext zza(String str) {
/* 4 */                 return new CachedContext(str, null);
                    }

/* 4 */             private Companion() {
/* 5 */                 throw null;
                    }
                }
            }
