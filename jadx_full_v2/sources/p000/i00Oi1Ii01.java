            package p000;

            import android.view.DisplayCutout;
            import android.view.WindowInsets;
            import java.lang.invoke.VarHandle;
            import java.util.Objects;
            
/* 3 */     public class i00Oi1Ii01 extends i00Oi000 {
                public i00Oi1Ii01(i00iooo00li i00iooo00liVar, WindowInsets windowInsets) {
/* 1 */             super(i00iooo00liVar, windowInsets);
                }

                @Override
                public i00iooo00li I00000oIO() {
/* 8 */             return i00iooo00li.I0000Il00O(null, this.I0000Il00O.consumeDisplayCutout());
                }

                @Override
                public IiiIlIlO I000O01llI0() {
/* 3 */             DisplayCutout displayCutout = this.I0000Il00O.getDisplayCutout();
/* 7 */             if (displayCutout == null) {
/* 9 */                 return null;
                    }
/* 13 */            IiiIlIlO iiiIlIlO = new IiiIlIlO();
/* 16 */            iiiIlIlO.I00000oIO = displayCutout;
/* 18 */            VarHandle.storeStoreFence();
/* 55 */            return iiiIlIlO;
                }

                @Override
                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof i00Oi1Ii01)) {
/* 7 */                 return false;
                    }
/* 11 */            i00Oi1Ii01 i00oi1ii01 = (i00Oi1Ii01) obj;
                    return Objects.equals(this.I0000Il00O, i00oi1ii01.I0000Il00O) && Objects.equals(this.I000II, i00oi1ii01.I000II) && i00OOi.I00Io1lO(this.I000O01llI0, i00oi1ii01.I000O01llI0);
                }

                @Override
                public int hashCode() {
/* 3 */             return this.I0000Il00O.hashCode();
                }

/* 4 */         public i00Oi1Ii01(i00iooo00li i00iooo00liVar, i00Oi1Ii01 i00oi1ii01) {
/* 5 */             super(i00iooo00liVar, i00oi1ii01);
                }
            }
