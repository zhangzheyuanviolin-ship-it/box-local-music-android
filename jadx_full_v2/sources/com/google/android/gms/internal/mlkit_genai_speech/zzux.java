            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.IlIO00o1;
            import p000.OIOi0lOI;
            import p000.OIOi0o;
            import p000.io1OllI;
            
            final class zzux implements OIOi0lOI {
                static final zzux zza = new zzux();
                private static final IlIO00o1 zzb = io1OllI.I0001Ioi1lo(1, IlIO00o1.I00000oIO("options"));
                private static final IlIO00o1 zzc = io1OllI.I0001Ioi1lo(2, IlIO00o1.I00000oIO("commonEvent"));
                private static final IlIO00o1 zzd = io1OllI.I0001Ioi1lo(3, IlIO00o1.I00000oIO("numPartial"));
                private static final IlIO00o1 zze = io1OllI.I0001Ioi1lo(4, IlIO00o1.I00000oIO("numFinal"));
                private static final IlIO00o1 zzf = io1OllI.I0001Ioi1lo(5, IlIO00o1.I00000oIO("source"));

                private zzux() {
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             zzack zzackVar = (zzack) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 11 */            oIOi0o.add(zzb, zzackVar.zzc());
/* 20 */            oIOi0o.add(zzc, zzackVar.zza());
/* 29 */            oIOi0o.add(zzd, zzackVar.zze());
/* 38 */            oIOi0o.add(zze, zzackVar.zzd());
/* 47 */            oIOi0o.add(zzf, zzackVar.zzb());
                }
            }
