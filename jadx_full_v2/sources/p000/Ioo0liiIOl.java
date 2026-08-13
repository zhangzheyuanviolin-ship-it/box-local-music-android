            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class Ioo0liiIOl extends O1ooOo implements OoIOloiIii {
                public i00O0OOIlOO I00o0iI0io1;
                public i00O0OOIlOO I00o0l1o1o0;

                public Ioo0liiIOl() {
/* 4 */             IlO10l ilO10l = iO1OO0i0i.I00000oIO;
/* 6 */             this.I00o0iI0io1 = ilO10l;
/* 8 */             this.I00o0l1o1o0 = ilO10l;
                }

                @Override
                public final Object I000l1() {
/* 1 */             return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
                }

                @Override
                public void I010101Oo1lO() {
/* 4 */             Ioo0l1 ioo0l1 = new Ioo0l1(1);
/* 7 */             ioo0l1.I00iiI = this;
/* 9 */             VarHandle.storeStoreFence();
/* 14 */            lOo1ii0o1.I00000oOI(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", ioo0l1);
/* 17 */            I010l1ol111();
                }

                @Override
                public void I010I0() {
/* 3 */             this.I00o0l1o1o0 = this.I00o0iI0io1;
/* 8 */             Ioo0l1 ioo0l1 = new Ioo0l1(0);
/* 11 */            ioo0l1.I00iiI = this;
/* 13 */            VarHandle.storeStoreFence();
/* 18 */            lOo1ii0o1.I0000O(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", ioo0l1);
                }

                @Override
                public final void I010II() {
/* 3 */             this.I00o0iI0io1 = iO1OO0i0i.I00000oIO;
                }

                public abstract i00O0OOIlOO I010l1O(i00O0OOIlOO i00o0ooiloo);

                public void I010l1ol111() {
/* 7 */             this.I00o0l1o1o0 = I010l1O(this.I00o0iI0io1);
/* 12 */            Ioo0l1 ioo0l1 = new Ioo0l1(0);
/* 15 */            ioo0l1.I00iiI = this;
/* 17 */            VarHandle.storeStoreFence();
/* 22 */            lOo1ii0o1.I0000O(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", ioo0l1);
                }
            }
