            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.IlIO00o1;
            import p000.OIOi0lOI;
            import p000.OIOi0o;
            import p000.io1OllI;
            
            final class zzvd implements OIOi0lOI {
                static final zzvd zza = new zzvd();
                private static final IlIO00o1 zzb = io1OllI.I0001Ioi1lo(1, IlIO00o1.I00000oIO("appId"));
                private static final IlIO00o1 zzc = io1OllI.I0001Ioi1lo(2, IlIO00o1.I00000oIO("appVersion"));
                private static final IlIO00o1 zzd = io1OllI.I0001Ioi1lo(3, IlIO00o1.I00000oIO("firebaseProjectId"));
                private static final IlIO00o1 zze = io1OllI.I0001Ioi1lo(4, IlIO00o1.I00000oIO("mlSdkVersion"));
                private static final IlIO00o1 zzf = io1OllI.I0001Ioi1lo(5, IlIO00o1.I00000oIO("tfliteSchemaVersion"));
                private static final IlIO00o1 zzg = io1OllI.I0001Ioi1lo(6, IlIO00o1.I00000oIO("gcmSenderId"));
                private static final IlIO00o1 zzh = io1OllI.I0001Ioi1lo(7, IlIO00o1.I00000oIO("apiKey"));
                private static final IlIO00o1 zzi = io1OllI.I0001Ioi1lo(8, IlIO00o1.I00000oIO("languages"));
                private static final IlIO00o1 zzj = io1OllI.I0001Ioi1lo(9, IlIO00o1.I00000oIO("mlSdkInstanceId"));
                private static final IlIO00o1 zzk = io1OllI.I0001Ioi1lo(10, IlIO00o1.I00000oIO("isClearcutClient"));
                private static final IlIO00o1 zzl = io1OllI.I0001Ioi1lo(11, IlIO00o1.I00000oIO("isStandaloneMlkit"));
                private static final IlIO00o1 zzm = io1OllI.I0001Ioi1lo(12, IlIO00o1.I00000oIO("isJsonLogging"));
                private static final IlIO00o1 zzn = io1OllI.I0001Ioi1lo(13, IlIO00o1.I00000oIO("buildLevel"));
                private static final IlIO00o1 zzo = io1OllI.I0001Ioi1lo(14, IlIO00o1.I00000oIO("optionalModuleVersion"));

                private zzvd() {
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             zzacv zzacvVar = (zzacv) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 11 */            oIOi0o.add(zzb, zzacvVar.zzg());
/* 20 */            oIOi0o.add(zzc, zzacvVar.zzh());
/* 26 */            oIOi0o.add(zzd, (Object) null);
/* 35 */            oIOi0o.add(zze, zzacvVar.zzj());
/* 44 */            oIOi0o.add(zzf, zzacvVar.zzk());
/* 49 */            oIOi0o.add(zzg, (Object) null);
/* 54 */            oIOi0o.add(zzh, (Object) null);
/* 63 */            oIOi0o.add(zzi, zzacvVar.zza());
/* 72 */            oIOi0o.add(zzj, zzacvVar.zzi());
/* 81 */            oIOi0o.add(zzk, zzacvVar.zzb());
/* 90 */            oIOi0o.add(zzl, zzacvVar.zzd());
/* 99 */            oIOi0o.add(zzm, zzacvVar.zzc());
/* 108 */           oIOi0o.add(zzn, zzacvVar.zze());
/* 117 */           oIOi0o.add(zzo, zzacvVar.zzf());
                }
            }
