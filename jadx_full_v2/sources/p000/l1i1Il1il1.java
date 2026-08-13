            package p000;

            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l1i1Il1il1 {
                public static final int I00000oIO(int i, List list) {
                    int i2;
/* 7 */             int i3 = ((OIoiIo0o1O) IOOi0Ool1i.I00Io1o110i(list)).I0000Il00O;
/* 17 */            if (i > ((OIoiIo0o1O) IOOi0Ool1i.I00Io1o110i(list)).I0000Il00O) {
/* 42 */                Ioliol.I00000oIO("Index " + i + " should be less or equal than last line's end " + i3);
                    }
/* 50 */            int size = list.size() - 1;
/* 52 */            int i4 = 0;
                    while (true) {
/* 53 */                if (i4 > size) {
/* 88 */                    i2 = -(i4 + 1);
                            break;
                        }
/* 57 */                i2 = (i4 + size) >>> 1;
/* 62 */                OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) list.get(i2);
/* 76 */                char c = oIoiIo0o1O.I00000oOI > i ? (char) 1 : oIoiIo0o1O.I0000Il00O <= i ? (char) 65535 : (char) 0;
/* 77 */                if (c >= 0) {
/* 82 */                    if (c <= 0) {
                                break;
                            }
                            size = i2 - 1;
                        } else {
/* 79 */                    i4 = i2 + 1;
                        }
                    }
/* 89 */            if (i2 >= 0 && i2 < list.size()) {
/* 100 */               return i2;
                    }
/* 101 */           int size2 = list.size();
/* 115 */           String strI00000oIO = O10lllI0o0.I00000oIO(list, null, new O1o0i0Ol0Oo0(15), 31);
/* 125 */           StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("Found paragraph index ", i2, " should be in range [0, ", size2, ").\nDebug info: index=");
/* 129 */           sbI0010I0i.append(i);
/* 134 */           sbI0010I0i.append(", paragraphs=[");
/* 137 */           sbI0010I0i.append(strI00000oIO);
/* 142 */           sbI0010I0i.append("]");
/* 149 */           Ioliol.I00000oIO(sbI0010I0i.toString());
/* 332 */           return i2;
                }

                public static final int I00000oOI(int i, List list) {
/* 6 */             int size = list.size() - 1;
/* 8 */             int i2 = 0;
/* 9 */             while (i2 <= size) {
/* 13 */                int i3 = (i2 + size) >>> 1;
/* 18 */                OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) list.get(i3);
/* 32 */                char c = oIoiIo0o1O.I0000O > i ? (char) 1 : oIoiIo0o1O.I0000oI00 <= i ? (char) 65535 : (char) 0;
/* 33 */                if (c < 0) {
/* 35 */                    i2 = i3 + 1;
                        } else {
/* 38 */                    if (c <= 0) {
/* 43 */                        return i3;
                            }
                            size = i3 - 1;
                        }
                    }
/* 45 */            return -(i2 + 1);
                }

                public static final int I0000Il00O(ArrayList arrayList, float f) {
/* 5 */             if (f <= 0.0f) {
/* 4 */                 return 0;
                    }
/* 18 */            if (f >= ((OIoiIo0o1O) IOOi0Ool1i.I00Io1o110i(arrayList)).I000II) {
/* 20 */                return IOOi1I.I000II(arrayList);
                    }
/* 30 */            int size = arrayList.size() - 1;
/* 31 */            int i = 0;
/* 32 */            while (i <= size) {
/* 36 */                int i2 = (i + size) >>> 1;
/* 41 */                OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(i2);
/* 59 */                char c = oIoiIo0o1O.I0001Ioi1lo > f ? (char) 1 : oIoiIo0o1O.I000II <= f ? (char) 65535 : (char) 0;
/* 60 */                if (c < 0) {
/* 62 */                    i = i2 + 1;
                        } else {
/* 65 */                    if (c <= 0) {
/* 70 */                        return i2;
                            }
                            size = i2 - 1;
                        }
                    }
/* 72 */            return -(i + 1);
                }

                public static final void I0000O(ArrayList arrayList, long j, Function1 function1) {
/* 9 */             int size = arrayList.size();
/* 13 */            for (int iI00000oIO = I00000oIO(Oo0lI00l.I000II(j), arrayList); iI00000oIO < size; iI00000oIO++) {
/* 19 */                OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(iI00000oIO);
/* 27 */                if (oIoiIo0o1O.I00000oOI >= Oo0lI00l.I0001Ioi1lo(j)) {
/* 98 */                    return;
                        }
/* 33 */                if (oIoiIo0o1O.I00000oOI != oIoiIo0o1O.I0000Il00O) {
/* 35 */                    function1.invoke(oIoiIo0o1O);
                        }
                    }
                }
            }
