            package p000;

            import java.util.Arrays;
            import java.util.function.BiConsumer;
            
            public final class i0Oi0O01oioi implements BiConsumer {
                public i0OIIoiOl1I I00000oIO;
                public i0OIIoiOl1I I00000oOI;

                @Override
                public final void accept(Object obj, Object obj2) {
/* 1 */             i0IOoO1 i0iooo1 = (i0IOoO1) obj;
/* 3 */             int i = i0OiO1il.I00000oIO;
/* 5 */             i0OIIoiOl1I i0oiioiol1i = this.I00000oOI;
/* 9 */             Object objApply = this.I00000oIO.apply(obj2);
/* 13 */            Object objApply2 = i0oiioiol1i.apply(obj2);
/* 19 */            int i2 = i0iooo1.I00000oOI + 1;
/* 21 */            Object[] objArrCopyOf = i0iooo1.I00000oIO;
/* 23 */            int length = objArrCopyOf.length;
/* 24 */            int i3 = i2 + i2;
/* 25 */            if (i3 > length) {
/* 31 */                objArrCopyOf = Arrays.copyOf(objArrCopyOf, IoilIilo.I0000O(length, i3));
/* 35 */                i0iooo1.I00000oIO = objArrCopyOf;
                    }
/* 37 */            if (objApply == null) {
/* 64 */                IOOlIIilOl0.I000II("null key in entry: null=".concat(String.valueOf(objApply2)));
/* 89 */                return;
                    }
/* 39 */            int i4 = i0iooo1.I00000oOI;
/* 41 */            int i5 = i4 + i4;
/* 43 */            objArrCopyOf[i5] = objApply;
/* 47 */            objArrCopyOf[i5 + 1] = objApply2;
/* 51 */            i0iooo1.I00000oOI = i4 + 1;
                }
            }
