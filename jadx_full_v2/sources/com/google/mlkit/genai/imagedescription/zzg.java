            package com.google.mlkit.genai.imagedescription;

            import p000.IOOlIIilOl0;
            import p000.Oi010OO0;
            
            final class zzg extends ImageDescriptionResult {
                private final String zza;
                private final float zzb;

                public zzg(String str, float f) {
/* 4 */             if (str == null) {
/* 13 */                IOOlIIilOl0.I000II("Null description");
/* 89 */                throw null;
                    }
/* 6 */             this.zza = str;
/* 8 */             this.zzb = f;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof ImageDescriptionResult) {
/* 10 */                ImageDescriptionResult imageDescriptionResult = (ImageDescriptionResult) obj;
/* 22 */                if (this.zza.equals(imageDescriptionResult.getDescription()) && Float.floatToIntBits(this.zzb) == Float.floatToIntBits(imageDescriptionResult.zza())) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                @Override
                public final String getDescription() {
/* 1 */             return this.zza;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.zza.hashCode() ^ 1000003;
/* 18 */            return Float.floatToIntBits(this.zzb) ^ (iHashCode * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("ImageDescriptionResult{description=");
/* 10 */            sb.append(this.zza);
/* 15 */            sb.append(", score=");
/* 22 */            return Oi010OO0.I001i1O0Ol(sb, this.zzb, "}");
                }

                @Override
                public final float zza() {
/* 1 */             return this.zzb;
                }
            }
