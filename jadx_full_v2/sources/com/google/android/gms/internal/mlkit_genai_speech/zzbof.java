            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.I000II;
            import p000.IO1010;
            import p000.IO10l0l0;
            import p000.IO10lIoiO;
            import p000.IOoil1iiIilo;
            import p000.Ii0111o;
            import p000.IllOOo00lI;
            import p000.OoiIlOl1iI;
            import p000.iOl1iOi0I;
            import p000.lIoii1l01l0i;
            
            public final class zzbof {
                private final IllOOo00lI zza;
                private final IO1010 zzb = iOl1iOi0I.I00000oIO(-1, null, null, 6);

                public zzbof(IllOOo00lI illOOo00lI) {
/* 4 */             this.zza = illOOo00lI;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object zza(IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    zzboe zzboeVar;
/* 3 */             if (iOoil1iiIilo instanceof zzboe) {
/* 6 */                 zzboeVar = (zzboe) iOoil1iiIilo;
/* 8 */                 int i = zzboeVar.zzc;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    zzboeVar.zzc = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    zzboeVar = new zzboe(this, iOoil1iiIilo);
                        }
                    }
/* 25 */            Object obj = zzboeVar.zza;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = zzboeVar.zzc;
/* 32 */            if (i2 != 0 && i2 != 1) {
/* 42 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                return null;
                    }
/* 36 */            lIoii1l01l0i.I00000oOI(obj);
/* 59 */            while (!((Boolean) this.zza.invoke()).booleanValue()) {
/* 61 */                IO1010 io1010 = this.zzb;
/* 63 */                zzboeVar.zzc = 1;
/* 69 */                if (io1010.I000iOII(zzboeVar) == ii0111o) {
/* 71 */                    return ii0111o;
                        }
                    }
/* 72 */            return OoiIlOl1iI.I00000oIO;
                }

                public final void zzb() throws Throwable {
/* 5 */             Object objI000lI = this.zzb.I000lI(OoiIlOl1iI.I00000oIO);
/* 11 */            if (objI000lI instanceof IO10l0l0) {
/* 15 */                Throwable thI00000oOI = IO10lIoiO.I00000oOI((IO10l0l0) objI000lI);
/* 19 */                if (thI00000oOI != null) {
/* 27 */                    throw thI00000oOI;
                        }
/* 23 */                I000II.I000O01llI0("Should be impossible; a CONFLATED channel should never return false on offer");
                    }
                }
            }
