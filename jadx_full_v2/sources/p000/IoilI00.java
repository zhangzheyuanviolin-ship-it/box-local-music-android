            package p000;

            import android.util.Size;
            import android.view.Surface;
            import com.google.common.util.concurrent.ListenableFuture;
            
/* 10 */    public final class IoilI00 extends IiIO1ol1i1o0 {
                public final int I000o00OoI0I = 1;
                public final Object I000oI1ioi;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IoilI00(Oll0I0l1i1 oll0I0l1i1, Size size) {
/* 8 */             super(34, size);
/* 4 */             this.I000oI1ioi = oll0I0l1i1;
                }

                @Override
                public final ListenableFuture I0001Ioi1lo() {
/* 1 */             int i = this.I000o00OoI0I;
/* 3 */             Object obj = this.I000oI1ioi;
                    switch (i) {
                        case 0:
/* 15 */                    return iIllIoiiIO.I0000O((Surface) obj);
                        default:
/* 10 */                    return ((Oll0I0l1i1) obj).I0001Ioi1lo;
                    }
                }

/* 11 */        public IoilI00(Surface surface, Size size, int i) {
/* 12 */            super(i, size);
/* 13 */            this.I000oI1ioi = surface;
                }
            }
