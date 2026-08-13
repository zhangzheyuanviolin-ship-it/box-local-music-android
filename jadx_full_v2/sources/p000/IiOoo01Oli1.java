            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class IiOoo01Oli1 extends RuntimeException {
                public final IOl0l1Io I00iOIl;

                public IiOoo01Oli1(IOl0l1Io iOl0l1Io) {
/* 4 */             this.I00iOIl = iOl0l1Io;
/* 8 */             if (iOl0l1Io.I00000oOI) {
/* 120 */               return;
                    }
/* 12 */            int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
/* 17 */            List list = iOl0l1Io.I00000oIO;
/* 19 */            int size = list.size();
/* 25 */            ArrayList arrayList = new ArrayList();
/* 29 */            int i = 0;
/* 30 */            while (i < size) {
/* 32 */                int i2 = i + 1;
/* 38 */                IOl0o1 iOl0o1 = (IOl0o1) list.get(i);
/* 46 */                if (!I1IoiO1l.I0000oI00(iArr, iOl0o1.I00000oIO)) {
/* 52 */                    if (iOl0o1.I00000oIO == 100) {
/* 54 */                        int i3 = i + 2;
/* 56 */                        if (i3 < size && ((IOl0o1) list.get(i3)).I00000oIO == 1000) {
                                    break;
                                } else {
/* 71 */                            IOOii0O10Io0.I001IIilI0O(arrayList);
                                }
                            } else {
/* 75 */                        arrayList.add(iOl0o1);
                            }
                        }
/* 78 */                i = i2;
                    }
/* 80 */            int size2 = arrayList.size();
/* 84 */            StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
/* 86 */            for (int i4 = 0; i4 < size2; i4++) {
/* 112 */               stackTraceElementArr[i4] = new StackTraceElement("$$compose", Oi010OO0.I000oI1ioi(((IOl0o1) arrayList.get(i4)).I00000oIO, "m$"), "SourceFile", 1);
                    }
/* 117 */           setStackTrace(stackTraceElementArr);
                }

                @Override
                public final Throwable fillInStackTrace() {
/* 4 */             setStackTrace(new StackTraceElement[0]);
/* 20 */            return this;
                }

                @Override
                public final String getMessage() {
/* 1 */             IOl0l1Io iOl0l1Io = this.I00iOIl;
/* 5 */             if (!iOl0l1Io.I00000oOI) {
/* 98 */                return "Composition stack when thrown:";
                    }
/* 11 */            StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
/* 14 */            O101lO1 o101lO1I0000oI00 = IOOi1I.I0000oI00();
/* 18 */            List list = iOl0l1Io.I00000oIO;
/* 22 */            int i = 1;
/* 23 */            O1OlO1II o1OlO1II = new O1OlO1II(i);
/* 26 */            o1OlO1II.I00iiI = list;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            int iI00000oOI = o1OlO1II.I00000oOI();
/* 37 */            for (int i2 = 0; i2 < iI00000oOI; i2++) {
/* 45 */                ((IOl0o1) o1OlO1II.get(i2)).getClass();
                    }
/* 51 */            O101lO1 o101lO1I0000Il00O = IOOi1I.I0000Il00O(o101lO1I0000oI00);
/* 57 */            O1OlO1II o1OlO1II2 = new O1OlO1II(i);
/* 60 */            o1OlO1II2.I00iiI = o101lO1I0000Il00O;
/* 62 */            VarHandle.storeStoreFence();
/* 65 */            int iI00000oOI2 = o1OlO1II2.I00000oOI();
/* 69 */            for (int i3 = 0; i3 < iI00000oOI2; i3++) {
/* 75 */                String str = (String) o1OlO1II2.get(i3);
/* 79 */                sb.append("\tat ");
/* 82 */                sb.append(str);
/* 87 */                sb.append('\n');
                    }
/* 93 */            return sb.toString();
                }
            }
