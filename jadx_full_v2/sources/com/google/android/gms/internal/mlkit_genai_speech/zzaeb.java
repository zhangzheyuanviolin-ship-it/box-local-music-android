            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.content.Context;
            import android.content.res.Resources;
            import java.util.HashMap;
            import java.util.Locale;
            import java.util.Objects;
            import java.util.concurrent.Callable;
            import p000.IOi0li0I0;
            import p000.IioIii0IO;
            import p000.Io0Ool;
            import p000.O0oO1lOOo1;
            import p000.O11oilI;
            import p000.Oioo1I0o;
            import p000.OloIIoII1oo;
            import p000.iiOlilo0IIIl;
            import p000.iio00I0oi;
            import p000.io1OllI;
            
            public final class zzaeb {
                private static zzhk zza;
                private static final zzhn zzb = zzhn.zze("optional-module-barcode", "com.google.android.gms.vision.barcode");
                private final String zzc;
                private final String zzd;
                private final zzadu zze;
                private final Oioo1I0o zzf;
                private final OloIIoII1oo zzg;
                private final OloIIoII1oo zzh;
                private final String zzi;
                private final int zzj;

                public zzaeb(Context context, final Oioo1I0o oioo1I0o, zzadu zzaduVar, String str) {
/* 6 */             new HashMap();
/* 11 */            new HashMap();
/* 18 */            this.zzc = context.getPackageName();
/* 24 */            this.zzd = IOi0li0I0.I00000oIO(context);
/* 26 */            this.zzf = oioo1I0o;
/* 28 */            this.zze = zzaduVar;
/* 30 */            zzael.zza();
/* 33 */            this.zzi = str;
/* 35 */            iiOlilo0IIIl.I001IO000();
/* 47 */            this.zzg = iiOlilo0IIIl.I00Io1o110i(new Callable() {
                        @Override
                        public final Object call() {
/* 3 */                     return zzaeb.zza(this.zza);
                        }
                    });
/* 49 */            iiOlilo0IIIl.I001IO000();
/* 52 */            Objects.requireNonNull(oioo1I0o);
/* 64 */            this.zzh = iiOlilo0IIIl.I00Io1o110i(new Callable() {
                        @Override
                        public final Object call() {
/* 3 */                     return oioo1I0o.getMlSdkInstanceId();
                        }
                    });
/* 66 */            zzhn zzhnVar = zzb;
/* 87 */            this.zzj = zzhnVar.containsKey(str) ? IioIii0IO.I0000O(context, (String) zzhnVar.get(str), false) : -1;
                }

                public static String zza(zzaeb zzaebVar) {
/* 5 */             return O0oO1lOOo1.I0000Il00O.I00000oIO(zzaebVar.zzi);
                }

                public static void zzb(zzaeb zzaebVar, zzadt zzadtVar, zzxq zzxqVar, String str) {
/* 1 */             zzadtVar.zzb(zzxqVar);
/* 4 */             String strZzd = zzadtVar.zzd();
/* 10 */            zzact zzactVar = new zzact();
/* 15 */            zzactVar.zzb(zzaebVar.zzc);
/* 20 */            zzactVar.zzc(zzaebVar.zzd);
/* 27 */            zzactVar.zzh(zzd());
/* 32 */            zzactVar.zzg(Boolean.TRUE);
/* 35 */            zzactVar.zzl(strZzd);
/* 38 */            zzactVar.zzj(str);
/* 41 */            OloIIoII1oo oloIIoII1oo = zzaebVar.zzh;
/* 62 */            zzactVar.zzi(oloIIoII1oo.I000OOo1O() ? (String) oloIIoII1oo.I000II() : zzaebVar.zzf.getMlSdkInstanceId());
/* 71 */            zzactVar.zzd(10);
/* 80 */            zzactVar.zzk(Integer.valueOf(zzaebVar.zzj));
/* 83 */            zzadtVar.zzc(zzactVar);
/* 88 */            zzaebVar.zze.zza(zzadtVar);
                }

                private static synchronized zzhk zzd() {
                    try {
/* 4 */                 zzhk zzhkVar = zza;
/* 6 */                 if (zzhkVar != null) {
/* 9 */                     return zzhkVar;
                        }
/* 18 */                O11oilI o11oilII00000oIO = iio00I0oi.I00000oIO(Resources.getSystem().getConfiguration());
/* 24 */                zzhh zzhhVar = new zzhh();
/* 32 */                for (int i = 0; i < o11oilII00000oIO.I00000oOI(); i++) {
/* 34 */                    Locale localeI00000oIO = o11oilII00000oIO.I00000oIO(i);
/* 38 */                    Io0Ool io0Ool = IOi0li0I0.I00000oIO;
/* 44 */                    zzhhVar.zze(localeI00000oIO.toLanguageTag());
                        }
/* 52 */                zzhk zzhkVarZzg = zzhhVar.zzg();
/* 56 */                zza = zzhkVarZzg;
/* 59 */                return zzhkVarZzg;
                    } catch (Throwable th) {
/* 110 */               throw th;
                    }
                }

                public final void zzc(final zzadt zzadtVar, final zzxq zzxqVar) throws Throwable {
                    final String strI00000oIO;
/* 1 */             OloIIoII1oo oloIIoII1oo = this.zzg;
/* 7 */             if (oloIIoII1oo.I000OOo1O()) {
/* 13 */                strI00000oIO = (String) oloIIoII1oo.I000II();
                    } else {
/* 20 */                strI00000oIO = O0oO1lOOo1.I0000Il00O.I00000oIO(this.zzi);
                    }
/* 30 */            io1OllI.I00000oIO(1, new Runnable() {
                        @Override
                        public final void run() {
/* 9 */                     zzaeb.zzb(this.zza, zzadtVar, zzxqVar, strI00000oIO);
                        }
                    });
                }
            }
