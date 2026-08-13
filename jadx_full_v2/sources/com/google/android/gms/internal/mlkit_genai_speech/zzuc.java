            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.IlIO00o1;
            import p000.OIOi0lOI;
            import p000.OIOi0o;
            import p000.io1OllI;
            
            final class zzuc implements OIOi0lOI {
                static final zzuc zza = new zzuc();
                private static final IlIO00o1 zzb = io1OllI.I0001Ioi1lo(1, IlIO00o1.I00000oIO("featureVersion"));
                private static final IlIO00o1 zzc = io1OllI.I0001Ioi1lo(2, IlIO00o1.I00000oIO("errorCode"));
                private static final IlIO00o1 zzd = io1OllI.I0001Ioi1lo(3, IlIO00o1.I00000oIO("isColdCall"));
                private static final IlIO00o1 zze = io1OllI.I0001Ioi1lo(4, IlIO00o1.I00000oIO("inputSize"));
                private static final IlIO00o1 zzf = io1OllI.I0001Ioi1lo(5, IlIO00o1.I00000oIO("outputSize"));
                private static final IlIO00o1 zzg = io1OllI.I0001Ioi1lo(6, IlIO00o1.I00000oIO("latencyMs"));
                private static final IlIO00o1 zzh = io1OllI.I0001Ioi1lo(7, IlIO00o1.I00000oIO("firstTokenLatencyMs"));

                private zzuc() {
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             zzabi zzabiVar = (zzabi) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 8 */             oIOi0o.add(zzb, (Object) null);
/* 17 */            oIOi0o.add(zzc, zzabiVar.zza());
/* 22 */            oIOi0o.add(zzd, (Object) null);
/* 27 */            oIOi0o.add(zze, (Object) null);
/* 36 */            oIOi0o.add(zzf, zzabiVar.zzb());
/* 45 */            oIOi0o.add(zzg, zzabiVar.zzd());
/* 54 */            oIOi0o.add(zzh, zzabiVar.zzc());
                }
            }
