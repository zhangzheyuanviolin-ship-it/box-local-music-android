            package com.google.mlkit.genai.proofreading;

            import p000.IOOlIIilOl0;
            import p000.IlIi0I0;
            import p000.io0OIIlOli1;
            
            final class zze extends ProofreadingResult {
                private final io0OIIlOli1 zza;

                public zze(io0OIIlOli1 io0oiiloli1) {
/* 4 */             if (io0oiiloli1 != null) {
/* 6 */                 this.zza = io0oiiloli1;
                    } else {
/* 11 */                IOOlIIilOl0.I000II("Null results");
/* 49 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof ProofreadingResult) {
/* 17 */                return this.zza.equals(((ProofreadingResult) obj).getResults());
                    }
/* 22 */            return false;
                }

                @Override
                public final io0OIIlOli1 getResults() {
/* 1 */             return this.zza;
                }

                public final int hashCode() {
/* 10 */            return this.zza.hashCode() ^ 1000003;
                }

                public final String toString() {
/* 11 */            return IlIi0I0.I000lI("ProofreadingResult{results=", this.zza.toString(), "}");
                }
            }
