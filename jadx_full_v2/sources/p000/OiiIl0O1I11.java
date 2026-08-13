            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            import sun.misc.Unsafe;
            
            public final class OiiIl0O1I11 implements IIoOOiIO0o1I, OoooliO1IoI1 {
                public static final long I00ilO0 = I1Ioolli0l0o.I00000oIO.objectFieldOffset(OiiIl0O1I11.class.getDeclaredField("state$volatile"));
                public final Ii00l101O I00iOIl;
                public Object I00iiO;
                private volatile Object state$volatile = OiiIo1O.I00000oIO;
                public ArrayList I00iiI = new ArrayList(2);
                public int I00iio = -1;
                public Object I00ilI0I1 = OiiIo1O.I0000O;

                public OiiIl0O1I11(Ii00l101O ii00l101O) {
/* 4 */             this.I00iOIl = ii00l101O;
                }

                @Override
                public final void I00000oIO(Oii1O0I oii1O0I, int i) {
/* 1 */             this.I00iiO = oii1O0I;
/* 3 */             this.I00iio = i;
                }

                @Override
                public final void I00000oOI(Throwable th) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */                 long j = I00ilO0;
/* 5 */                 Object objectVolatile = unsafe.getObjectVolatile(this, j);
/* 11 */                if (objectVolatile == OiiIo1O.I00000oOI) {
/* 27 */                    return;
                        }
/* 16 */                OiiIl0O1I11 oiiIl0O1I11 = this;
/* 21 */                if (unsafe.compareAndSwapObject(oiiIl0O1I11, j, objectVolatile, OiiIo1O.I0000Il00O)) {
/* 23 */                    ArrayList arrayList = oiiIl0O1I11.I00iiI;
/* 25 */                    if (arrayList == null) {
/* 27 */                        return;
                            }
/* 28 */                    Iterator it = arrayList.iterator();
/* 36 */                    while (it.hasNext()) {
/* 44 */                        ((OiiIOiI1oi) it.next()).I00000oIO();
                            }
/* 50 */                    oiiIl0O1I11.I00ilI0I1 = OiiIo1O.I0000O;
/* 53 */                    oiiIl0O1I11.I00iiI = null;
/* 55 */                    return;
                        }
/* 56 */                this = oiiIl0O1I11;
                    }
                }

                public final Object I0000Il00O(IOoilo iOoilo) {
/* 1 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */             long j = I00ilO0;
/* 9 */             OiiIOiI1oi oiiIOiI1oi = (OiiIOiI1oi) unsafe.getObjectVolatile(this, j);
/* 11 */            Object obj = oiiIOiI1oi.I0000O;
/* 13 */            Object obj2 = this.I00ilI0I1;
/* 15 */            ArrayList arrayList = this.I00iiI;
/* 17 */            if (arrayList != null) {
/* 20 */                Iterator it = arrayList.iterator();
/* 28 */                while (it.hasNext()) {
/* 34 */                    OiiIOiI1oi oiiIOiI1oi2 = (OiiIOiI1oi) it.next();
/* 36 */                    if (oiiIOiI1oi2 != oiiIOiI1oi) {
/* 38 */                        oiiIOiI1oi2.I00000oIO();
                            }
                        }
/* 46 */                I1Ioolli0l0o.I00000oIO.putObjectVolatile(this, j, OiiIo1O.I00000oOI);
/* 51 */                this.I00ilI0I1 = OiiIo1O.I0000O;
/* 54 */                this.I00iiI = null;
                    }
/* 60 */            Object objInvoke = oiiIOiI1oi.I0000Il00O.invoke(oiiIOiI1oi.I00000oIO, obj, obj2);
/* 64 */            Illl0OO0l illl0OO0l = oiiIOiI1oi.I0000oI00;
                    return obj == OiiIo1O.I0000oI00 ? ((Function1) illl0OO0l).invoke(iOoilo) : ((IlliIl1l11O) illl0OO0l).invoke(objInvoke, iOoilo);
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000O(IOoilo iOoilo) throws Throwable {
                    OiiIiOII001 oiiIiOII001;
                    Object obj;
                    IIoOoIol0Io0 iIoOoIol0Io0;
/* 3 */             if (iOoilo instanceof OiiIiOII001) {
/* 6 */                 oiiIiOII001 = (OiiIiOII001) iOoilo;
/* 8 */                 int i = oiiIiOII001.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oiiIiOII001.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 23 */                    oiiIiOII001 = new OiiIiOII001(this, iOoilo);
                        }
                    }
/* 19 */            OiiIiOII001 oiiIiOII0012 = oiiIiOII001;
/* 27 */            Object obj2 = oiiIiOII0012.I00iOIl;
/* 29 */            Object obj3 = Ii0111o.I00iOIl;
/* 31 */            int i2 = oiiIiOII0012.I00iiO;
/* 36 */            if (i2 == 0) {
/* 57 */                lIoii1l01l0i.I00000oOI(obj2);
/* 60 */                oiiIiOII0012.I00iiO = 1;
/* 68 */                IIoOoIol0Io0 iIoOoIol0Io02 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(oiiIiOII0012));
/* 71 */                iIoOoIol0Io02.I00111O();
                        while (true) {
/* 74 */                    Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 76 */                    long j = I00ilO0;
/* 78 */                    Object objectVolatile = unsafe.getObjectVolatile(this, j);
/* 82 */                    obj = OoiIlOl1iI.I00000oIO;
/* 84 */                    I0OooiI1I i0OooiI1I = OiiIo1O.I00000oIO;
/* 86 */                    if (objectVolatile == i0OooiI1I) {
/* 93 */                        iIoOoIol0Io0 = iIoOoIol0Io02;
/* 94 */                        if (unsafe.compareAndSwapObject(this, j, objectVolatile, iIoOoIol0Io02)) {
/* 96 */                            iIoOoIol0Io0.I001i1O0Ol(this);
                                    break;
                                }
/* 142 */                       iIoOoIol0Io02 = iIoOoIol0Io0;
                            } else {
/* 100 */                       iIoOoIol0Io0 = iIoOoIol0Io02;
/* 103 */                       if (objectVolatile instanceof List) {
/* 111 */                           if (unsafe.compareAndSwapObject(this, j, objectVolatile, i0OooiI1I)) {
/* 115 */                               Iterator it = ((Iterable) objectVolatile).iterator();
/* 123 */                               while (it.hasNext()) {
/* 129 */                                   OiiIOiI1oi oiiIOiI1oiI0000oI00 = I0000oI00(it.next());
/* 133 */                                   oiiIOiI1oiI0000oI00.I000II = null;
/* 136 */                                   oiiIOiI1oiI0000oI00.I000O01llI0 = -1;
/* 138 */                                   I000II(oiiIOiI1oiI0000oI00, true);
                                        }
                                    }
/* 142 */                           iIoOoIol0Io02 = iIoOoIol0Io0;
                                } else {
/* 146 */                           if (!(objectVolatile instanceof OiiIOiI1oi)) {
/* 192 */                               IOOlIIilOl0.I000lI("unexpected state: ", objectVolatile);
/* 33 */                                return null;
                                    }
/* 148 */                           OiiIOiI1oi oiiIOiI1oi = (OiiIOiI1oi) objectVolatile;
/* 150 */                           Object obj4 = this.I00ilI0I1;
/* 152 */                           Function3 function3 = oiiIOiI1oi.I0001Ioi1lo;
/* 165 */                           iIoOoIol0Io0.I000OiO(obj, function3 != null ? (Function3) function3.invoke(this, oiiIOiI1oi.I0000O, obj4) : null);
                                }
                            }
                        }
/* 168 */               Object objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 174 */               if (objI0010I0i == Ii0111o.I00iOIl) {
/* 176 */                   obj = objI0010I0i;
                        }
/* 177 */               if (obj != obj3) {
                        }
                    }
/* 38 */            if (i2 != 1) {
/* 40 */                if (i2 == 2) {
/* 42 */                    lIoii1l01l0i.I00000oOI(obj2);
/* 45 */                    return obj2;
                        }
/* 48 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                return null;
                    }
/* 52 */            lIoii1l01l0i.I00000oOI(obj2);
/* 180 */           oiiIiOII0012.I00iiO = 2;
/* 182 */           Object objI0000Il00O = I0000Il00O(oiiIiOII0012);
                    return objI0000Il00O == obj3 ? obj3 : objI0000Il00O;
                }

                public final OiiIOiI1oi I0000oI00(Object obj) {
                    Object next;
/* 1 */             ArrayList arrayList = this.I00iiI;
/* 4 */             if (arrayList == null) {
/* 3 */                 return null;
                    }
/* 7 */             Iterator it = arrayList.iterator();
                    while (true) {
/* 15 */                if (!it.hasNext()) {
/* 29 */                    next = null;
                            break;
                        }
/* 17 */                next = it.next();
/* 26 */                if (((OiiIOiI1oi) next).I00000oIO == obj) {
                            break;
                        }
                    }
/* 30 */            OiiIOiI1oi oiiIOiI1oi = (OiiIOiI1oi) next;
/* 32 */            if (oiiIOiI1oi != null) {
/* 34 */                return oiiIOiI1oi;
                    }
/* 39 */            OIiilo1Ool0o.I0000oI00(obj, "Clause with object ", " is not found");
/* 3 */             return null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void I0001Ioi1lo(o01l1ioOo0 o01l1iooo0, IlliIl1l11O illiIl1l11O) {
/* 29 */            I000II(new OiiIOiI1oi(this, o01l1iooo0.I00iOIl, (Function3) o01l1iooo0.I00iiI, (Function3) o01l1iooo0.I00iiO, null, (Oll0io) illiIl1l11O, (Function3) o01l1iooo0.I00iio), false);
                }

                public final void I000II(OiiIOiI1oi oiiIOiI1oi, boolean z) {
/* 1 */             Object obj = oiiIOiI1oi.I00000oIO;
/* 3 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 5 */             long j = I00ilO0;
/* 13 */            if (unsafe.getObjectVolatile(this, j) instanceof OiiIOiI1oi) {
/* 15 */                return;
                    }
/* 16 */            if (!z) {
/* 18 */                ArrayList arrayList = this.I00iiI;
/* 24 */                if (!arrayList.isEmpty()) {
/* 27 */                    Iterator it = arrayList.iterator();
/* 35 */                    while (it.hasNext()) {
/* 45 */                        if (((OiiIOiI1oi) it.next()).I00000oIO == obj) {
/* 50 */                            IoOOl0iOl1io.I001lIiIIo1O("Cannot use select clauses on the same object: ", obj);
/* 53 */                            return;
                                }
                            }
                        }
                    }
/* 58 */            oiiIOiI1oi.I00000oOI.invoke(obj, this, oiiIOiI1oi.I0000O);
/* 65 */            if (this.I00ilI0I1 != OiiIo1O.I0000O) {
/* 91 */                I1Ioolli0l0o.I00000oIO.putObjectVolatile(this, j, oiiIOiI1oi);
/* 551 */               return;
                    }
/* 67 */            if (!z) {
/* 71 */                this.I00iiI.add(oiiIOiI1oi);
                    }
/* 76 */            oiiIOiI1oi.I000II = this.I00iiO;
/* 80 */            oiiIOiI1oi.I000O01llI0 = this.I00iio;
/* 83 */            this.I00iiO = null;
/* 86 */            this.I00iio = -1;
                }

                public final int I000O01llI0(Object obj, Object obj2) {
                    OiiIl0O1I11 oiiIl0O1I11;
                    while (true) {
/* 1 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */                 long j = I00ilO0;
/* 5 */                 Object objectVolatile = unsafe.getObjectVolatile(this, j);
/* 13 */                if (objectVolatile instanceof IIoOo1iIio1l) {
/* 15 */                    OiiIOiI1oi oiiIOiI1oiI0000oI00 = this.I0000oI00(obj);
/* 19 */                    if (oiiIOiI1oiI0000oI00 != null) {
/* 22 */                        Function3 function3 = oiiIOiI1oiI0000oI00.I0001Ioi1lo;
/* 38 */                        Function3 function32 = function3 != null ? (Function3) function3.invoke(this, oiiIOiI1oiI0000oI00.I0000O, obj2) : null;
/* 35 */                        oiiIl0O1I11 = this;
/* 44 */                        if (unsafe.compareAndSwapObject(oiiIl0O1I11, j, objectVolatile, oiiIOiI1oiI0000oI00)) {
/* 46 */                            IIoOo1iIio1l iIoOo1iIio1l = (IIoOo1iIio1l) objectVolatile;
/* 48 */                            oiiIl0O1I11.I00ilI0I1 = obj2;
/* 52 */                            I0OooiI1I i0OooiI1II000OOo1O = iIoOo1iIio1l.I000OOo1O(OoiIlOl1iI.I00000oIO, function32);
/* 56 */                            if (i0OooiI1II000OOo1O == null) {
/* 60 */                                oiiIl0O1I11.I00ilI0I1 = OiiIo1O.I0000O;
/* 12 */                                return 2;
                                    }
/* 63 */                            iIoOo1iIio1l.I000oI1ioi(i0OooiI1II000OOo1O);
/* 11 */                            return 0;
                                }
                            } else {
                                continue;
                            }
                        } else {
/* 69 */                    oiiIl0O1I11 = this;
/* 76 */                    if (O0000Ioio00.I0000O(objectVolatile, OiiIo1O.I00000oOI) || (objectVolatile instanceof OiiIOiI1oi)) {
/* 136 */                       return 3;
                            }
/* 89 */                    if (O0000Ioio00.I0000O(objectVolatile, OiiIo1O.I0000Il00O)) {
/* 12 */                        return 2;
                            }
/* 98 */                    if (O0000Ioio00.I0000O(objectVolatile, OiiIo1O.I00000oIO)) {
/* 108 */                       if (unsafe.compareAndSwapObject(oiiIl0O1I11, j, objectVolatile, Collections.singletonList(obj))) {
/* 128 */                           return 1;
                                }
                            } else {
/* 113 */                       if (!(objectVolatile instanceof List)) {
/* 132 */                           IOOlIIilOl0.I000lI("Unexpected state: ", objectVolatile);
/* 11 */                            return 0;
                                }
/* 126 */                       if (unsafe.compareAndSwapObject(oiiIl0O1I11, j, objectVolatile, IOOi0Ool1i.I00OI1((Collection) objectVolatile, obj))) {
/* 128 */                           return 1;
                                }
                            }
                        }
/* 67 */                this = oiiIl0O1I11;
                    }
                }
            }
