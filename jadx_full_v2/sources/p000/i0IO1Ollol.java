            package p000;

            import android.os.Bundle;
            import android.os.ParcelFileDescriptor;
            
            public final class i0IO1Ollol extends i0IIo11i {
                public final int I000OiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i0IO1Ollol(i0Ii1l i0ii1l, OloIlI0ll oloIlI0ll, int i) {
/* 3 */             super(i0ii1l, oloIlI0ll);
/* 1 */             this.I000OiO = i;
                }

                @Override
                public void I00O0o1oo(Bundle bundle, Bundle bundle2) {
                    switch (this.I000OiO) {
                        case 1:
/* 10 */                    super.I00O0o1oo(bundle, bundle2);
/* 23 */                    this.I000O01llI0.I0000O((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
                            break;
                        default:
/* 6 */                     super.I00O0o1oo(bundle, bundle2);
                            break;
                    }
                }
            }
