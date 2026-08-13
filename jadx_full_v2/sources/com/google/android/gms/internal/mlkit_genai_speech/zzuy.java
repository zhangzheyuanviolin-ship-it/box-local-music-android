            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.IlIO00o1;
            import p000.OIOi0lOI;
            import p000.OIOi0o;
            import p000.io1OllI;
            
            final class zzuy implements OIOi0lOI {
                static final zzuy zza = new zzuy();
                private static final IlIO00o1 zzb = io1OllI.I0001Ioi1lo(1, IlIO00o1.I00000oIO("locales"));
                private static final IlIO00o1 zzc = io1OllI.I0001Ioi1lo(2, IlIO00o1.I00000oIO("preferredModes"));
                private static final IlIO00o1 zzd = io1OllI.I0001Ioi1lo(3, IlIO00o1.I00000oIO("selectedMode"));

                private zzuy() {
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             zzaco zzacoVar = (zzaco) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 11 */            oIOi0o.add(zzb, zzacoVar.zza());
/* 20 */            oIOi0o.add(zzc, zzacoVar.zzb());
/* 26 */            oIOi0o.add(zzd, (Object) null);
                }
            }
