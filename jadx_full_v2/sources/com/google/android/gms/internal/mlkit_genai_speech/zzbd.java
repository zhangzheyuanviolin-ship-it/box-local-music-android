            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzbd extends zzagd implements zzaho {
                private static final zzbd zze;
                private static volatile zzahv zzf;
                private zzcz zzA;
                private int zzg;
                private int zzh;
                private boolean zzi;
                private boolean zzj;
                private zzcw zzl;
                private zzbi zzm;
                private zzbq zzn;
                private zzak zzo;
                private zzga zzp;
                private zzet zzq;
                private zzax zzr;
                private zzag zzs;
                private zzad zzt;
                private boolean zzu;
                private boolean zzv;
                private boolean zzw;
                private zzaa zzx;
                private zzan zzy;
                private zzew zzz;
                private byte zzB = 2;
                private boolean zzk = true;

                static {
/* 3 */             zzbd zzbdVar = new zzbd();
/* 6 */             zze = zzbdVar;
/* 10 */            zzagg.zzD(zzbd.class, zzbdVar);
                }

                private zzbd() {
                }

                public static zzbb zza() {
/* 7 */             return (zzbb) zze.zzo();
                }

                public static void zzd(zzbd zzbdVar, zzaa zzaaVar) {
/* 1 */             zzaaVar.getClass();
/* 4 */             zzbdVar.zzx = zzaaVar;
                    zzbdVar.zzg |= 65536;
                }

                public static void zze(zzbd zzbdVar, zzbi zzbiVar) {
/* 1 */             zzbiVar.getClass();
/* 4 */             zzbdVar.zzm = zzbiVar;
                    zzbdVar.zzg |= 32;
                }

                public static void zzf(zzbd zzbdVar, zzcw zzcwVar) {
/* 1 */             zzcwVar.getClass();
/* 4 */             zzbdVar.zzl = zzcwVar;
                    zzbdVar.zzg |= 16;
                }

                public static void zzg(zzbd zzbdVar, zzew zzewVar) {
/* 1 */             zzewVar.getClass();
/* 4 */             zzbdVar.zzz = zzewVar;
                    zzbdVar.zzg |= 262144;
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 5 */             if (i2 == 0) {
/* 131 */               return Byte.valueOf(this.zzB);
                    }
/* 8 */             if (i2 == 2) {
/* 124 */               return zzagg.zzA(zze, "\u0004\u0014\u0000\u0001\u0001\u0015\u0014\u0000\u0000\u0002\u0001င\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဇ\r\rဇ\u000e\u000eဉ\u000b\u000fဇ\u000f\u0011ဉ\u0010\u0012ᐉ\u0011\u0013ဉ\u0012\u0014ᐉ\u0013\u0015ဉ\f", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzu", "zzv", "zzs", "zzw", "zzx", "zzy", "zzz", "zzA", "zzt"});
                    }
/* 11 */            if (i2 == 3) {
/* 70 */                return new zzbd();
                    }
/* 14 */            zzbc zzbcVar = null;
/* 15 */            if (i2 == 4) {
/* 64 */                return new zzbb(zzbcVar);
                    }
/* 18 */            if (i2 == 5) {
/* 59 */                return zze;
                    }
/* 21 */            if (i2 != 6) {
/* 28 */                this.zzB = obj == null ? (byte) 0 : (byte) 1;
/* 14 */                return null;
                    }
/* 31 */            zzahv zzahvVar = zzf;
/* 33 */            if (zzahvVar != null) {
/* 58 */                return zzahvVar;
                    }
                    synchronized (zzbd.class) {
                        try {
/* 38 */                    zzagbVar = zzf;
/* 40 */                    if (zzagbVar == null) {
/* 46 */                        zzagbVar = new zzagb(zze);
/* 49 */                        zzf = zzagbVar;
                            }
                        } catch (Throwable th) {
/* 57 */                    throw th;
                        }
                    }
/* 55 */            return zzagbVar;
                }
            }
