            package p000;

            import java.io.File;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.Iterator;
            import kotlin.jvm.functions.Function1;
            
/* 10 */    public final class IlIl0l implements OilO0iOl {
                public final int I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;

                public IlIl0l(IllOOo00lI illOOo00lI, Function1 function1) {
/* 2 */             this.I00000oIO = 1;
/* 7 */             this.I00000oOI = illOOo00lI;
/* 9 */             this.I0000Il00O = function1;
                }

                @Override
                public final Iterator iterator() {
                    switch (this.I00000oIO) {
                        case 0:
/* 70 */                    IlIl0i ilIl0i = new IlIl0i();
/* 73 */                    ilIl0i.I00iio = this;
/* 77 */                    ArrayDeque arrayDeque = new ArrayDeque();
/* 80 */                    ilIl0i.I00iiO = arrayDeque;
/* 84 */                    File file = (File) this.I00000oOI;
/* 90 */                    if (file.isDirectory()) {
/* 96 */                        arrayDeque.push(ilIl0i.I00000oOI(file));
                            } else if (file.isFile()) {
/* 114 */                       arrayDeque.push(new IlIiooII(file));
                            } else {
/* 118 */                       ilIl0i.I00iOIl = 2;
                            }
/* 99 */                    VarHandle.storeStoreFence();
/* 121 */                   return ilIl0i;
                        case 1:
/* 56 */                    Io00llIoO1lO io00llIoO1lO = new Io00llIoO1lO(0);
/* 59 */                    io00llIoO1lO.I00iio = this;
/* 62 */                    io00llIoO1lO.I00iiI = -2;
/* 64 */                    VarHandle.storeStoreFence();
/* 67 */                    return io00llIoO1lO;
                        case 2:
/* 31 */                    IlIloII10O ilIloII10O = new IlIloII10O(2);
/* 34 */                    ilIloII10O.I00ilI0I1 = this;
/* 44 */                    ilIloII10O.I00iiI = ((OilO0iOl) this.I00000oOI).iterator();
/* 47 */                    ilIloII10O.I00iiO = -1;
/* 49 */                    VarHandle.storeStoreFence();
/* 52 */                    return ilIloII10O;
                        default:
/* 10 */                    Io00llIoO1lO io00llIoO1lO2 = new Io00llIoO1lO(4);
/* 13 */                    io00llIoO1lO2.I00iio = this;
/* 23 */                    io00llIoO1lO2.I00iiO = ((OilO0iOl) this.I00000oOI).iterator();
/* 25 */                    VarHandle.storeStoreFence();
/* 28 */                    return io00llIoO1lO2;
                    }
                }

/* 11 */        public IlIl0l(int i) {
/* 12 */            this.I00000oIO = i;
                }
            }
