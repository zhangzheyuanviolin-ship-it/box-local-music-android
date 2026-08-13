            package p000;

            import android.graphics.Rect;
            import android.os.Build;
            import android.view.View;
            import java.util.Collections;
            import java.util.List;
            import java.util.Objects;
            
/* 18 */    public class i00i1I1 {
                public static final i00iooo00li I00000oOI;
                public final i00iooo00li I00000oIO;

                static {
/* 1 */             int i = Build.VERSION.SDK_INT;
/* 50 */            I00000oOI = (i >= 36 ? new i00OOO1lo() : i >= 35 ? new i00OIoI() : new i00OIl1Io1()).I00000oOI().I00000oIO.I00000oIO().I00000oIO.I00000oOI().I00000oIO.I0000Il00O();
                }

                public i00i1I1(i00iooo00li i00iooo00liVar) {
/* 4 */             this.I00000oIO = i00iooo00liVar;
                }

                public i00iooo00li I00000oIO() {
/* 1 */             return this.I00000oIO;
                }

                public i00iooo00li I00000oOI() {
/* 1 */             return this.I00000oIO;
                }

                public i00iooo00li I0000Il00O() {
/* 1 */             return this.I00000oIO;
                }

                public List<Rect> I0001Ioi1lo(int i) {
/* 1 */             return Collections.EMPTY_LIST;
                }

                public List<Rect> I000II(int i) {
/* 1 */             return Collections.EMPTY_LIST;
                }

                public IiiIlIlO I000O01llI0() {
/* 1 */             return null;
                }

                public Ioo0l0I I000OOo1O(int i) {
/* 1 */             return Ioo0l0I.I0000oI00;
                }

                public Ioo0l0I I000OiO(int i) {
/* 3 */             if ((i & 8) == 0) {
/* 5 */                 return Ioo0l0I.I0000oI00;
                    }
/* 10 */            I000II.I000iOII("Unable to query the maximum insets for IME");
/* 13 */            return null;
                }

                public Ioo0l0I I000iOII() {
/* 1 */             return I000o00OoI0I();
                }

                public Ioo0l0I I000l1() {
/* 1 */             return Ioo0l0I.I0000oI00;
                }

                public Ioo0l0I I000lI() {
/* 1 */             return I000o00OoI0I();
                }

                public Ioo0l0I I000o00OoI0I() {
/* 1 */             return Ioo0l0I.I0000oI00;
                }

                public Ioo0l0I I000oI1ioi() {
/* 1 */             return I000o00OoI0I();
                }

                public i00iooo00li I0010I0i(int i, int i2, int i3, int i4) {
/* 1 */             return I00000oOI;
                }

                public boolean I0010o() {
/* 1 */             return false;
                }

                public boolean I00111O() {
/* 1 */             return false;
                }

                public boolean I001IIilI0O(int i) {
/* 1 */             return true;
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof i00i1I1)) {
/* 7 */                 return false;
                    }
/* 11 */            i00i1I1 i00i1i1 = (i00i1I1) obj;
                    return I00111O() == i00i1i1.I00111O() && I0010o() == i00i1i1.I0010o() && Objects.equals(I000o00OoI0I(), i00i1i1.I000o00OoI0I()) && Objects.equals(I000l1(), i00i1i1.I000l1()) && Objects.equals(I000O01llI0(), i00i1i1.I000O01llI0());
                }

                public int hashCode() {
/* 33 */            return Objects.hash(Boolean.valueOf(I00111O()), Boolean.valueOf(I0010o()), I000o00OoI0I(), I000l1(), I000O01llI0());
                }

/* 19 */        public void I00100o1O0lo() {
                }

/* 28 */        public void I0000O(View view) {
                }

/* 28 */        public void I0000oI00(i00iooo00li i00iooo00liVar) {
                }

/* 28 */        public void I00100l0(View view) {
                }

/* 28 */        public void I001IO000(IiiIoi1O0 iiiIoi1O0) {
                }

/* 28 */        public void I001i1O0Ol(Ioo0l0I[] ioo0l0IArr) {
                }

/* 28 */        public void I001i1lo1io(Ioo0l0I ioo0l0I) {
                }

/* 28 */        public void I001iOo1i0O(i00iooo00li i00iooo00liVar) {
                }

/* 28 */        public void I001l0I00(int i) {
                }

/* 28 */        public void I001lIiIIo1O(Rect[][] rectArr) {
                }

/* 28 */        public void I001lllioOl(Rect[][] rectArr) {
                }
            }
