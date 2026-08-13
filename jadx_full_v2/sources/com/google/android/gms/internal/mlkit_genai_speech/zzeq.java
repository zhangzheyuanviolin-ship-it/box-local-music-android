            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzeq extends zzagd implements zzaho {
                private static final zzeq zze;
                private static volatile zzahv zzf;
                private Object zzh;
                private int zzg = 0;
                private byte zzi = 2;

                static {
/* 3 */             zzeq zzeqVar = new zzeq();
/* 6 */             zze = zzeqVar;
/* 10 */            zzagg.zzD(zzeq.class, zzeqVar);
                }

                private zzeq() {
                }

                public static zzeq zzf() {
/* 1 */             return zze;
                }

                public final zzdz zza() {
                    return this.zzg == 3 ? (zzdz) this.zzh : zzdz.zzc();
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 102 */               return Byte.valueOf(this.zzi);
                    }
/* 6 */             if (i2 == 2) {
/* 95 */                return zzagg.zzA(zze, "\u0004\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0001\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u00057\u0000\u0006м\u0000", new Object[]{"zzh", "zzg", zzeo.class, zzeg.class, zzdz.class, zzee.class, zzari.class});
                    }
/* 9 */             if (i2 == 3) {
/* 69 */                return new zzeq();
                    }
/* 12 */            zzep zzepVar = null;
/* 13 */            if (i2 == 4) {
/* 63 */                return new zzdu(zzepVar);
                    }
/* 16 */            if (i2 == 5) {
/* 58 */                return zze;
                    }
/* 19 */            if (i2 != 6) {
/* 26 */                this.zzi = obj == null ? (byte) 0 : (byte) 1;
/* 12 */                return null;
                    }
/* 29 */            zzahv zzahvVar = zzf;
/* 31 */            if (zzahvVar != null) {
/* 57 */                return zzahvVar;
                    }
                    synchronized (zzeq.class) {
                        try {
/* 36 */                    zzagbVar = zzf;
/* 38 */                    if (zzagbVar == null) {
/* 44 */                        zzagbVar = new zzagb(zze);
/* 47 */                        zzf = zzagbVar;
                            }
                        } catch (Throwable th) {
/* 56 */                    throw th;
                        }
                    }
/* 54 */            return zzagbVar;
                }

                public final zzeg zzc() {
                    return this.zzg == 2 ? (zzeg) this.zzh : zzeg.zzc();
                }

                public final zzeo zzd() {
                    return this.zzg == 1 ? (zzeo) this.zzh : zzeo.zzc();
                }

                public final zzari zzg() {
                    return this.zzg == 6 ? (zzari) this.zzh : zzari.zzf();
                }

                public final boolean zzh() {
                    return this.zzg == 3;
                }

                public final boolean zzi() {
                    return this.zzg == 2;
                }
            }
