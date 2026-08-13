            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.IoOOl0iOl1io;
            
            abstract class zzhb extends zzic {
                private final int zza;
                private int zzb;

                public zzhb(int i, int i2) {
/* 6 */             zzgo.zzb(i2, i, "index");
/* 9 */             this.zza = i;
/* 11 */            this.zzb = i2;
                }

                @Override
                public final boolean hasNext() {
                    return this.zzb < this.zza;
                }

                @Override
                public final boolean hasPrevious() {
                    return this.zzb > 0;
                }

                @Override
                public final Object next() {
/* 5 */             if (!hasNext()) {
/* 18 */                IoOOl0iOl1io.I00000oOI();
/* 21 */                return null;
                    }
/* 7 */             int i = this.zzb;
/* 11 */            this.zzb = i + 1;
/* 13 */            return zza(i);
                }

                @Override
                public final int nextIndex() {
/* 1 */             return this.zzb;
                }

                @Override
                public final Object previous() {
/* 5 */             if (!hasPrevious()) {
/* 18 */                IoOOl0iOl1io.I00000oOI();
/* 21 */                return null;
                    }
                    int i = this.zzb - 1;
/* 11 */            this.zzb = i;
/* 13 */            return zza(i);
                }

                @Override
                public final int previousIndex() {
/* 3 */             return this.zzb - 1;
                }

                public abstract Object zza(int i);
            }
