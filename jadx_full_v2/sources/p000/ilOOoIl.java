            package p000;

            import android.os.Parcel;
            
            public final class ilOOoIl extends iiI1l0 implements il0lI0oo1 {
                public final IlloOIoilIl I000II;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ilOOoIl(ilI001i ili001i, IlloOIoilIl illoOIoilIl) {
/* 5 */             super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
/* 1 */             this.I000II = illoOIoilIl;
                }

                @Override
                public final boolean I00000oOI(int i, Parcel parcel, Parcel parcel2) throws Throwable {
/* 2 */             if (i != 2) {
/* 9 */                 return false;
                    }
/* 4 */             zze();
/* 7 */             return true;
                }

                @Override
                public final void zze() throws Throwable {
/* 3 */             this.I000II.run();
                }
            }
