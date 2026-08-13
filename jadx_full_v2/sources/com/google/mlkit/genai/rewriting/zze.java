            package com.google.mlkit.genai.rewriting;

            import p000.IOOlIIilOl0;
            import p000.IlIi0I0;
            import p000.io0OO101I;
            
            final class zze extends RewritingResult {
                private final io0OO101I zza;

                public zze(io0OO101I io0oo101i) {
/* 4 */             if (io0oo101i != null) {
/* 6 */                 this.zza = io0oo101i;
                    } else {
/* 11 */                IOOlIIilOl0.I000II("Null results");
/* 49 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof RewritingResult) {
/* 17 */                return this.zza.equals(((RewritingResult) obj).getResults());
                    }
/* 22 */            return false;
                }

                @Override
                public final io0OO101I getResults() {
/* 1 */             return this.zza;
                }

                public final int hashCode() {
/* 10 */            return this.zza.hashCode() ^ 1000003;
                }

                public final String toString() {
/* 11 */            return IlIi0I0.I000lI("RewritingResult{results=", this.zza.toString(), "}");
                }
            }
