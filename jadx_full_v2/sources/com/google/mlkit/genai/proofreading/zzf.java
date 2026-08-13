            package com.google.mlkit.genai.proofreading;

            import p000.Oi010OO0;
            
            final class zzf extends ProofreadingSuggestion {
                private final String zza;
                private final float zzb;

                public zzf(String str, float f) {
/* 4 */             this.zza = str;
/* 6 */             this.zzb = f;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof ProofreadingSuggestion) {
/* 10 */                ProofreadingSuggestion proofreadingSuggestion = (ProofreadingSuggestion) obj;
/* 22 */                if (this.zza.equals(proofreadingSuggestion.getText()) && Float.floatToIntBits(this.zzb) == Float.floatToIntBits(proofreadingSuggestion.zza())) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                @Override
                public final String getText() {
/* 1 */             return this.zza;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.zza.hashCode() ^ 1000003;
/* 18 */            return Float.floatToIntBits(this.zzb) ^ (iHashCode * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("ProofreadingSuggestion{text=");
/* 10 */            sb.append(this.zza);
/* 15 */            sb.append(", score=");
/* 22 */            return Oi010OO0.I001i1O0Ol(sb, this.zzb, "}");
                }

                @Override
                public final float zza() {
/* 1 */             return this.zzb;
                }
            }
