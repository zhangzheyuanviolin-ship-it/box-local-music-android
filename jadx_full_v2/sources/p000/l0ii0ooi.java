            package p000;

            import java.util.Iterator;
            import java.util.List;
            
            public abstract class l0ii0ooi {
                public static final O0IOli0o0 I00000oIO(O0IiIl0il o0IiIl0il) {
/* 3 */             if (o0IiIl0il instanceof O0IOli0o0) {
/* 5 */                 return (O0IOli0o0) o0IiIl0il;
                    }
/* 10 */            Object obj = null;
/* 11 */            if (!(o0IiIl0il instanceof O0O0OIOO)) {
/* 99 */                IoOOl0iOl1io.I001IIilI0O("Cannot calculate JVM erasure for type: ", o0IiIl0il);
/* 10 */                return null;
                    }
/* 15 */            List upperBounds = ((O0O0OIOO) o0IiIl0il).getUpperBounds();
/* 22 */            Iterator it = upperBounds.iterator();
                    while (true) {
/* 30 */                if (!it.hasNext()) {
                            break;
                        }
/* 32 */                Object next = it.next();
/* 39 */                O0IiIl0il o0IiIl0ilI001IIilI0O = ((O0O01O0o) next).I001IIilI0O();
/* 50 */                O0Ii1IOoiO o0Ii1IOoiO = o0IiIl0ilI001IIilI0O instanceof O0Ii1IOoiO ? (O0Ii1IOoiO) o0IiIl0ilI001IIilI0O : null;
/* 51 */                if (o0Ii1IOoiO != null && o0Ii1IOoiO.I00IoiI() != IOIOll0I.I00iiO && o0Ii1IOoiO.I00IoiI() != IOIOll0I.I00ilO0) {
/* 69 */                    obj = next;
                            break;
                        }
                    }
/* 70 */            O0O01O0o o0O01O0o = (O0O01O0o) obj;
/* 72 */            if (o0O01O0o == null) {
/* 79 */                o0O01O0o = (O0O01O0o) IOOi0Ool1i.I00II0Ol1O0l(upperBounds);
                    }
                    return o0O01O0o != null ? I00000oOI(o0O01O0o) : OOoOl0i.I00000oIO.I00000oOI(Object.class);
                }

                public static final O0IOli0o0 I00000oOI(O0O01O0o o0O01O0o) {
/* 1 */             O0IiIl0il o0IiIl0ilI001IIilI0O = o0O01O0o.I001IIilI0O();
/* 5 */             if (o0IiIl0ilI001IIilI0O != null) {
/* 7 */                 return I00000oIO(o0IiIl0ilI001IIilI0O);
                    }
/* 14 */            IoOOl0iOl1io.I001IIilI0O("Cannot calculate JVM erasure for type: ", o0O01O0o);
/* 17 */            return null;
                }
            }
