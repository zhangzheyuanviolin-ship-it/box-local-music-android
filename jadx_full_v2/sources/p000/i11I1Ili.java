            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.util.ArrayDeque;
            import java.util.Arrays;
            import java.util.EnumSet;
            import java.util.Map;
            import java.util.concurrent.Callable;
            
            public final class i11I1Ili implements l0lO0IOIooO, i1ol10I, I1OlOl11O0, OliiillO, l01lllOO0, lo11I0lO {
                public final int I00iOIl;
                public Object I00iiI;

                public i11I1Ili(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public void I00000oIO(int i, Object obj, i11lo1 i11lo1Var) {
/* 5 */             i11I0o0ii i11i0o0ii = (i11I0o0ii) this.I00iiI;
/* 8 */             i11i0o0ii.I000oI1ioi(i, 3);
/* 13 */            i11lo1Var.I000II((i1111ll) obj, i11i0o0ii.I00000oIO);
/* 17 */            i11i0o0ii.I000oI1ioi(i, 4);
                }

                @Override
                public void I00000oOI(String str, int i, Throwable th, byte[] bArr, Map map) {
/* 11 */            ((lilOOl0) this.I00iiI).I001i1lo1io(str, i, th, bArr, map);
                }

                public void I0000Il00O(int i, Object obj, i11lo1 i11lo1Var) {
/* 1 */             i1111ll i1111llVar = (i1111ll) obj;
/* 5 */             i11I0o0ii i11i0o0ii = (i11I0o0ii) this.I00iiI;
/* 11 */            i11i0o0ii.I00100o1O0lo((i << 3) | 2);
/* 18 */            i11i0o0ii.I00100o1O0lo(i1111llVar.I00000oIO(i11lo1Var));
/* 23 */            i11lo1Var.I000II(i1111llVar, i11i0o0ii.I00000oIO);
                }

                public void I0000O(iOIo11i ioio11i, i0O1001OIi i0o1001oii) {
/* 3 */             o01l1ioOo0 o01l1iooo0 = new o01l1ioOo0();
/* 6 */             long j = i0o1001oii.I00000oIO;
/* 12 */            if (j == 0) {
/* 139 */               IOOlIIilOl0.I000iOII();
/* 332 */               return;
                    }
/* 14 */            long j2 = i0o1001oii.I00000oOI;
/* 18 */            if (j2 == 0) {
/* 135 */               IOOlIIilOl0.I000iOII();
/* 138 */               return;
                    }
/* 27 */            Long lValueOf = Long.valueOf(Long.MAX_VALUE & (j2 - j));
/* 35 */            lIil0l010OO liil0l010ooI000l1 = ((lIO0IIo) i0o1001oii.I0000O).I000l1();
/* 43 */            lIil0l010OO liil0l010ooI000l12 = ((lIO0IIo) i0o1001oii.I0000oI00).I000l1();
/* 51 */            lIil0l010OO liil0l010ooI000l13 = ((lIO0IIo) i0o1001oii.I0001Ioi1lo).I000l1();
/* 55 */            int i = i0o1001oii.I0000Il00O;
/* 64 */            Integer numValueOf = i != 0 ? Integer.valueOf(i) : null;
/* 67 */            iOl001i1iO1i iol001i1io1i = new iOl001i1iO1i();
/* 70 */            iol001i1io1i.I00000oIO = lValueOf;
/* 72 */            iol001i1io1i.I00000oOI = liil0l010ooI000l13;
/* 74 */            iol001i1io1i.I0000Il00O = liil0l010ooI000l12;
/* 76 */            iol001i1io1i.I0000O = liil0l010ooI000l1;
/* 78 */            iol001i1io1i.I0000oI00 = numValueOf;
/* 80 */            VarHandle.storeStoreFence();
/* 83 */            o01l1iooo0.I00iiO = iol001i1io1i;
/* 89 */            OoIol00Ool ooIol00Ool = new OoIol00Ool(9);
/* 97 */            ooIol00Ool.I00iiO = new OOoo1il();
/* 99 */            ooIol00Ool.I00iiI = o01l1iooo0;
/* 101 */           iOloo0O0O.I000l1();
/* 104 */           VarHandle.storeStoreFence();
/* 109 */           iOllO10O iollo10o = (iOllO10O) this.I00iiI;
/* 114 */           IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(5);
/* 117 */           iO0iIlI1li.I00iiI = iollo10o;
/* 119 */           iO0iIlI1li.I00iiO = ooIol00Ool;
/* 121 */           iO0iIlI1li.I00iio = ioio11i;
/* 125 */           iO0iIlI1li.I00ilI0I1 = "o:a:mlkit:1.0.0";
/* 127 */           VarHandle.storeStoreFence();
/* 131 */           io1OllI.I00000oIO(1, iO0iIlI1li);
                }

                public void I0000oI00(il1oII0OlIo il1oii0olio) {
/* 3 */             ArrayDeque arrayDeque = (ArrayDeque) this.I00iiI;
/* 9 */             if (!il1oii0olio.I000iOII()) {
/* 161 */               if (!(il1oii0olio instanceof ioo11I)) {
/* 190 */                   I000II.I000iOII("Has a new type of ByteString been created? Found ".concat(String.valueOf(il1oii0olio.getClass())));
/* 437 */                   return;
                        }
/* 163 */               ioo11I ioo11i = (ioo11I) il1oii0olio;
/* 167 */               I0000oI00(ioo11i.I00iio);
/* 172 */               I0000oI00(ioo11i.I00ilI0I1);
/* 175 */               return;
                    }
/* 17 */            int iBinarySearch = Arrays.binarySearch(ioo11I.I00ioIO, il1oii0olio.I0001Ioi1lo());
/* 21 */            if (iBinarySearch < 0) {
                        iBinarySearch = (-(iBinarySearch + 1)) - 1;
                    }
/* 30 */            int iI001lIiIIo1O = ioo11I.I001lIiIIo1O(iBinarySearch + 1);
/* 38 */            if (arrayDeque.isEmpty() || ((il1oII0OlIo) arrayDeque.peek()).I0001Ioi1lo() >= iI001lIiIIo1O) {
/* 155 */               arrayDeque.push(il1oii0olio);
/* 158 */               return;
                    }
/* 53 */            int iI001lIiIIo1O2 = ioo11I.I001lIiIIo1O(iBinarySearch);
/* 61 */            il1oII0OlIo ioo11i2 = (il1oII0OlIo) arrayDeque.pop();
/* 67 */            while (!arrayDeque.isEmpty() && ((il1oII0OlIo) arrayDeque.peek()).I0001Ioi1lo() < iI001lIiIIo1O2) {
/* 89 */                ioo11i2 = new ioo11I((il1oII0OlIo) arrayDeque.pop(), ioo11i2);
                    }
/* 96 */            ioo11I ioo11i3 = new ioo11I(ioo11i2, il1oii0olio);
/* 103 */           while (!arrayDeque.isEmpty()) {
/* 109 */               int iBinarySearch2 = Arrays.binarySearch(ioo11I.I00ioIO, ioo11i3.I00iiO);
/* 113 */               if (iBinarySearch2 < 0) {
                            iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
                        }
/* 136 */               if (((il1oII0OlIo) arrayDeque.peek()).I0001Ioi1lo() >= ioo11I.I001lIiIIo1O(iBinarySearch2 + 1)) {
                            break;
                        } else {
/* 146 */                   ioo11i3 = new ioo11I((il1oII0OlIo) arrayDeque.pop(), ioo11i3);
                        }
                    }
/* 151 */           arrayDeque.push(ioo11i3);
                }

                public void I0001Ioi1lo(int i, Object obj, ioO0I1oi1lio ioo0i1oi1lio) {
/* 5 */             il1O00loO1 il1o00loo1 = (il1O00loO1) this.I00iiI;
/* 8 */             il1o00loo1.I000OOo1O(i, 3);
/* 13 */            ioo0i1oi1lio.I0001Ioi1lo((iilO1O) obj, il1o00loo1.I00000oIO);
/* 17 */            il1o00loo1.I000OOo1O(i, 4);
                }

                public void I000II(int i, Object obj, lO1liolI0IO lo1lioli0io) {
/* 5 */             l1lo010IOi0 l1lo010ioi0 = (l1lo010IOi0) this.I00iiI;
/* 8 */             l1lo010ioi0.I000l1(i, 3);
/* 13 */            lo1lioli0io.I0000oI00((lIoolOoilO) obj, l1lo010ioi0.I00000oIO);
/* 17 */            l1lo010ioi0.I000l1(i, 4);
                }

                public void I000O01llI0(int i, Object obj, ioO0I1oi1lio ioo0i1oi1lio) {
/* 3 */             iilO1O iilo1o = (iilO1O) obj;
/* 7 */             il1O00loO1 il1o00loo1 = (il1O00loO1) this.I00iiI;
/* 11 */            il1o00loo1.I000OiO((i << 3) | 2);
/* 18 */            il1o00loo1.I000OiO(iilo1o.I00000oIO(ioo0i1oi1lio));
/* 23 */            ioo0i1oi1lio.I0001Ioi1lo(iilo1o, il1o00loo1.I00000oIO);
                }

                public void I000OOo1O(int i, Object obj, lO1liolI0IO lo1lioli0io) {
/* 1 */             lIoolOoilO lioolooilo = (lIoolOoilO) obj;
/* 5 */             l1lo010IOi0 l1lo010ioi0 = (l1lo010IOi0) this.I00iiI;
/* 11 */            l1lo010ioi0.I000o00OoI0I((i << 3) | 2);
/* 21 */            l1lo010ioi0.I000o00OoI0I(((l1Ii10o) lioolooilo).I00000oIO(lo1lioli0io));
/* 26 */            lo1lioli0io.I0000oI00(lioolooilo, l1lo010ioi0.I00000oIO);
                }

                @Override
                public ListenableFuture call() {
                    switch (this.I00iOIl) {
                        case 8:
/* 48 */                    OoIlol ooIlol = new OoIlol((Callable) this.I00iiI);
/* 53 */                    Iii11Ooi.I00iOIl.execute(ooIlol);
/* 56 */                    return ooIlol;
                        default:
/* 8 */                     IIlOoolol0ll iIlOoolol0ll = (IIlOoolol0ll) this.I00iiI;
/* 13 */                    lolliO01l lollio01l = new lolliO01l(3);
/* 16 */                    lollio01l.I00000oOI = iIlOoolol0ll;
/* 18 */                    VarHandle.storeStoreFence();
/* 37 */                    return IlloOoiiO.I0000O(I01iIIO.I00100l0((ListenableFuture) iIlOoolol0ll.I00iiO, o0iOII1liI.I00000oOI(lollio01l), (OilOi0I1) iIlOoolol0ll.I00ilI0I1));
                    }
                }

                @Override
                public Object get() {
/* 1 */             Object obj = lIlIo1.I000OiO;
/* 17 */            return (llIOoOoIi) ((OIiiIl0iO) ((OliiillO) this.I00iiI).get()).I0000O();
                }

                @Override
                public Object zza() {
                    switch (this.I00iOIl) {
                        case 1:
/* 86 */                    return ((OoIOil1iIO) this.I00iiI).I00000oIO("FIREBASE_ML_SDK", Il0IIil.I00000oIO("json"), new IIIOlol(18));
                        default:
/* 8 */                     Type type = (Type) this.I00iiI;
/* 16 */                    if (!(type instanceof ParameterizedType)) {
/* 66 */                        throw new llIIooI0iolO("Invalid EnumSet type: ".concat(String.valueOf(type)), 25);
                            }
/* 26 */                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
/* 30 */                    if (type2 instanceof Class) {
/* 34 */                        return EnumSet.noneOf((Class) type2);
                            }
/* 52 */                    throw new llIIooI0iolO("Invalid EnumSet type: ".concat(String.valueOf(type)), 25);
                    }
                }

                @Override
                public iI01O0i0oll zzb(Class cls) {
/* 3 */             for (int i = 0; i < 2; i++) {
/* 9 */                 i1ol10I i1ol10i = ((i1ol10I[]) this.I00iiI)[i];
/* 15 */                if (i1ol10i.zzc(cls)) {
/* 17 */                    return i1ol10i.zzb(cls);
                        }
                    }
/* 35 */            OoOil11Ol1o.I000OiO("No factory is available for message type: ".concat(cls.getName()));
/* 38 */            return null;
                }

                @Override
                public boolean zzc(Class cls) {
/* 4 */             for (int i = 0; i < 2; i++) {
/* 16 */                if (((i1ol10I[]) this.I00iiI)[i].zzc(cls)) {
/* 18 */                    return true;
                        }
                    }
/* 1 */             return false;
                }
            }
