            package p000;

            import android.content.ClipData;
            import android.content.Context;
            import android.graphics.Bitmap;
            import android.util.Log;
            import com.google.ai.edge.gallery.customtasks.agentchat.AgentTools;
            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Objects;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.atomic.AtomicInteger;
            import kotlin.jvm.functions.Function3;
            
/* 12 */    public final class I00oIiI10 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public final Object I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I00oIiI10(Object obj, Object obj2, Object obj3, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = obj;
/* 5 */             this.I00iio = obj2;
/* 7 */             this.I00ilI0I1 = obj3;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
                
                    if (r9 == r0) goto L28;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
                
                    if (r8 == r0) goto L28;
                 */
                /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0050 -> B:20:0x0053). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I00000oIO(Object obj) throws Throwable {
                    LinkedHashSet linkedHashSet;
                    Iterator it;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 8 */             if (i == 0) {
/* 37 */                lIoii1l01l0i.I00000oOI(obj);
/* 42 */                IIil1o0olooo iIil1o0olooo = (IIil1o0olooo) this.I00ilI0I1;
                        synchronized (iIil1o0olooo.I0001Ioi1lo) {
/* 47 */                    linkedHashSet = iIil1o0olooo.I000II;
                        }
/* 50 */                it = linkedHashSet.iterator();
/* 59 */                if (it.hasNext()) {
                        }
/* 189 */               return ii0111o;
                    }
/* 10 */            if (i != 1) {
/* 12 */                if (i == 2) {
/* 14 */                    lIoii1l01l0i.I00000oOI(obj);
/* 190 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 21 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 6 */                 return null;
                    }
/* 27 */            IIioIlI0 iIioIlI0 = (IIioIlI0) this.I00iio;
/* 31 */            it = (Iterator) this.I00iiO;
/* 33 */            lIoii1l01l0i.I00000oOI(obj);
/* 90 */            if (!((Boolean) obj).booleanValue()) {
/* 113 */               Log.w("CXCP", "Failed to await closure from " + iIioIlI0 + '!');
                    }
/* 59 */            if (it.hasNext()) {
/* 121 */               OOiOlo1l0I0o oOiOlo1l0I0o = ((IIil1o0olooo) this.I00ilI0I1).I0000O;
/* 123 */               OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 133 */               ((IOi10loi) oOiOlo1l0I0o.I00000oIO.I00000oIO.I00ioIO).I00O10llo(ooiIlOl1iI);
/* 138 */               Oi01o1o10O01 oi01o1o10O01 = new Oi01o1o10O01();
/* 143 */               IOi10loi iOi10loi = new IOi10loi();
/* 146 */               oi01o1o10O01.I00000oIO = iOi10loi;
/* 148 */               VarHandle.storeStoreFence();
/* 163 */               if (((IIIII1OI1) oOiOlo1l0I0o.I0000oI00.I00iio).I000lI(oi01o1o10O01) instanceof IO10l0l0) {
/* 169 */                   Log.e("CXCP", "Camera close all request failed!");
/* 172 */                   iOi10loi.I00O10llo(ooiIlOl1iI);
                        }
/* 175 */               this.I00iiO = null;
/* 177 */               this.I00iio = null;
/* 179 */               this.I00iiI = 2;
/* 181 */               Object objI0010o = iOi10loi.I0010o(this);
/* 185 */               Ii0111o ii0111o2 = Ii0111o.I00iOIl;
                    } else {
/* 66 */                iIioIlI0 = (IIioIlI0) it.next();
/* 68 */                Objects.toString(iIioIlI0);
/* 71 */                this.I00iiO = it;
/* 73 */                this.I00iio = iIioIlI0;
/* 75 */                this.I00iiI = 1;
/* 77 */                obj = iIioIlI0.I00000oIO(this);
                    }
/* 189 */           return ii0111o;
                }

                private final Object I000II(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 6 */             if (i == 0) {
/* 21 */                lIoii1l01l0i.I00000oOI(obj);
/* 30 */                IIiOO0o iIiOO0o = (IIiOO0o) ((o01l1ioOo0) this.I00iiO).I00iio;
/* 36 */                String str = (String) this.I00iio;
/* 40 */                IIilllloil1 iIilllloil1 = (IIilllloil1) this.I00ilI0I1;
/* 43 */                IIilO0 iIilO0 = new IIilO0(0);
/* 46 */                iIilO0.I00iiI = str;
/* 48 */                iIilO0.I00iiO = iIilllloil1;
/* 50 */                VarHandle.storeStoreFence();
/* 53 */                this.I00iiI = 1;
/* 59 */                if (iIiOO0o.I00000oIO(iIilO0, this) == ii0111o) {
/* 61 */                    return ii0111o;
                        }
                    } else {
/* 8 */                 if (i != 1) {
/* 16 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 19 */                    return null;
                        }
/* 10 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 62 */            return OoiIlOl1iI.I00000oIO;
                }

                private final Object I000O01llI0(Object obj) throws Throwable {
/* 3 */             I0lIllO i0lIllO = (I0lIllO) this.I00ilI0I1;
/* 7 */             String str = (String) this.I00iio;
/* 9 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 11 */            int i = this.I00iiI;
                    try {
/* 15 */                if (i != 0) {
/* 17 */                    if (i == 1) {
/* 19 */                        lIoii1l01l0i.I00000oOI(obj);
/* 13 */                        return null;
                            }
/* 27 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                    return null;
                        }
/* 31 */                lIoii1l01l0i.I00000oOI(obj);
/* 40 */                OlOO1i11110 olOO1i11110 = (OlOO1i11110) ((IIo11l1iO) this.I00iiO).I00iOIl;
/* 42 */                this.I00iiI = 1;
/* 44 */                olOO1i11110.I00100l0(str, i0lIllO);
/* 49 */                if (OoiIlOl1iI.I00000oIO == ii0111o) {
/* 51 */                    return ii0111o;
                        }
/* 13 */                return null;
                    } catch (Exception e) {
/* 73 */                Log.w("CXCP", "Failed to open " + ((Object) IIllI0o.I0000Il00O(str)), e);
/* 76 */                int iI00000oIO = iOilOO1O1o.I00000oIO(e);
/* 80 */                if (iI00000oIO != 0) {
/* 95 */                    i0lIllO.I00000oOI(null, new I0lIliiI(IOO1iloOl.I00ilO0, IIlOloloOil.I00000oIO(iI00000oIO), e, 2));
                        }
/* 102 */               IIlOloloOil.I00000oIO(iOilOO1O1o.I00000oIO(e));
/* 13 */                return null;
                    }
                }

                private final Object I000iOII(Object obj) throws Throwable {
/* 3 */             Ii0110 ii0110 = (Ii0110) this.I00iiO;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i = this.I00iiI;
/* 10 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 13 */            if (i != 0) {
/* 15 */                if (i == 1) {
/* 17 */                    lIoii1l01l0i.I00000oOI(obj);
/* 20 */                    return ooiIlOl1iI;
                        }
/* 23 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                 return null;
                    }
/* 27 */            lIoii1l01l0i.I00000oOI(obj);
/* 32 */            IlOil1iooOO0 ilOil1iooOO0 = (IlOil1iooOO0) this.I00iio;
/* 38 */            OOlloO oOlloOI000OiO = ((IO101i) this.I00ilI0I1).I000OiO(ii0110);
/* 42 */            this.I00iiO = null;
/* 44 */            this.I00iiI = 1;
/* 46 */            Object objI00000oIO = ilOl0o1O.I00000oIO(ilOil1iooOO0, oOlloOI000OiO, true, this);
/* 50 */            if (objI00000oIO != ii0111o) {
/* 53 */                objI00000oIO = ooiIlOl1iI;
                    }
                    return objI00000oIO == ii0111o ? ii0111o : ooiIlOl1iI;
                }

                /* JADX WARN: Multi-variable type inference failed */
                private final Object I000lI(Object obj) throws Throwable {
                    Object objI00000oIO;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i = this.I00iiI;
/* 9 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    try {
/* 13 */                if (i == 0) {
/* 29 */                    lIoii1l01l0i.I00000oOI(obj);
/* 34 */                    Oil1IOoo1lI oil1IOoo1lI = (Oil1IOoo1lI) this.I00iio;
/* 36 */                    Object obj2 = this.I00ilI0I1;
/* 38 */                    this.I00iiO = null;
/* 40 */                    this.I00iiI = 1;
/* 46 */                    if (oil1IOoo1lI.I00000oOI(this, obj2) == ii0111o) {
/* 48 */                        return ii0111o;
                            }
                        } else {
/* 15 */                    if (i != 1) {
/* 25 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                        return null;
                            }
/* 17 */                    lIoii1l01l0i.I00000oOI(obj);
                        }
/* 49 */                objI00000oIO = ooiIlOl1iI;
                    } catch (Throwable th) {
/* 51 */                objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                    }
                    OoiIlOl1iI ooiIlOl1iI2 = ooiIlOl1iI;
/* 57 */            if (objI00000oIO instanceof Oi10Ii1i1lo) {
/* 60 */                Throwable thI00000oOI = Oi10ii.I00000oOI(objI00000oIO);
/* 66 */                IO10i1 iO10i1 = new IO10i1();
/* 69 */                iO10i1.I00000oIO = thI00000oOI;
/* 71 */                VarHandle.storeStoreFence();
                        ooiIlOl1iI2 = iO10i1;
                    }
/* 74 */            return IO10lIoiO.I00000oIO(ooiIlOl1iI2);
                }

                private final Object I000o00OoI0I(Object obj) throws Throwable {
                    OlO0OIIl1 olO0OIIl1;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 6 */             if (i == 0) {
/* 25 */                lIoii1l01l0i.I00000oOI(obj);
/* 30 */                IO1OIo01l1 iO1OIo01l1 = (IO1OIo01l1) this.I00iio;
/* 32 */                OlO0OIIl1 olO0OIIl12 = iO1OIo01l1.I0000O;
/* 34 */                IO1loOo1o iO1loOo1o = iO1OIo01l1.I00000oOI;
/* 38 */                String str = (String) this.I00ilI0I1;
/* 40 */                this.I00iiO = olO0OIIl12;
/* 42 */                this.I00iiI = 1;
/* 46 */                obj = iO1loOo1o.I00000oOI.getMessagesForConversationSync(str, this);
/* 50 */                if (obj == ii0111o) {
/* 52 */                    return ii0111o;
                        }
/* 53 */                olO0OIIl1 = olO0OIIl12;
                    } else {
/* 8 */                 if (i != 1) {
/* 20 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 23 */                    return null;
                        }
/* 12 */                olO0OIIl1 = (OlO0OIIl1) this.I00iiO;
/* 14 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 54 */            olO0OIIl1.I000l1(obj);
/* 57 */            return OoiIlOl1iI.I00000oIO;
                }

                private final Object I00100l0(Object obj) throws Throwable {
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 5 */             int i = this.I00iiI;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 10 */            if (i == 0) {
/* 25 */                lIoii1l01l0i.I00000oOI(obj);
/* 32 */                IO1loOo1o iO1loOo1o = ((IO1OIo01l1) this.I00iiO).I00000oOI;
/* 58 */                Conversation conversationCopy$default = Conversation.copy$default((Conversation) this.I00iio, null, (String) this.I00ilI0I1, null, null, 0L, 0L, 0, null, 253, null);
/* 62 */                this.I00iiI = 1;
/* 66 */                Object objUpdate = iO1loOo1o.I00000oIO.update(conversationCopy$default, this);
/* 70 */                if (objUpdate != ii0111o) {
/* 73 */                    objUpdate = ooiIlOl1iI;
                        }
/* 74 */                if (objUpdate == ii0111o) {
/* 76 */                    return ii0111o;
                        }
                    } else {
/* 12 */                if (i != 1) {
/* 20 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 23 */                    return null;
                        }
/* 14 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 77 */            return ooiIlOl1iI;
                }

                private final Object I00111O(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 6 */             if (i == 0) {
/* 21 */                lIoii1l01l0i.I00000oOI(obj);
/* 34 */                if (!((List) this.I00iiO).isEmpty() && ((Boolean) ((OlO01l1oOil) this.I00ilI0I1).getValue()).booleanValue()) {
/* 54 */                    O0o0I1i0O o0o0I1i0O = (O0o0I1i0O) this.I00iio;
/* 56 */                    this.I00iiI = 1;
/* 62 */                    if (i1Ioo11OIl.I00000oOI(o0o0I1i0O, this) == ii0111o) {
/* 64 */                        return ii0111o;
                            }
                        }
                    } else {
/* 8 */                 if (i != 1) {
/* 16 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 19 */                    return null;
                        }
/* 10 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 65 */            return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I001IIilI0O(Object obj) throws Throwable {
                    IlOil1iooOO0 ilOil1iooOO0;
                    Object obj2;
/* 3 */             Ii1OIIlOi ii1OIIlOi = (Ii1OIIlOi) this.I00ilI0I1;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i = this.I00iiI;
/* 10 */            int i2 = 1;
/* 11 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 13 */            int i3 = 2;
/* 14 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 15 */            if (i == 0) {
/* 54 */                lIoii1l01l0i.I00000oOI(obj);
/* 59 */                IlOil1iooOO0 ilOil1iooOO02 = (IlOil1iooOO0) this.I00iio;
/* 61 */                this.I00iio = ilOil1iooOO02;
/* 63 */                this.I00iiI = 1;
/* 76 */                Object objI0000oI00 = iOi1II01i0.I0000oI00(ii1OIIlOi.I0000Il00O.I00000oIO(), new Ii1IiiOOOO(ii1OIIlOi, iOoil1iiIilo, i3), this);
/* 80 */                if (objI0000oI00 != ii0111o) {
/* 84 */                    ilOil1iooOO0 = ilOil1iooOO02;
/* 85 */                    obj = objI0000oI00;
                        }
                    }
/* 17 */            if (i != 1) {
/* 19 */                if (i != 2) {
/* 21 */                    if (i == 3) {
/* 23 */                        lIoii1l01l0i.I00000oOI(obj);
/* 26 */                        return ooiIlOl1iI;
                            }
/* 29 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                    return null;
                        }
/* 35 */                obj2 = (Ii11I1iOiIo) this.I00iiO;
/* 39 */                ilOil1iooOO0 = (IlOil1iooOO0) this.I00iio;
/* 41 */                lIoii1l01l0i.I00000oOI(obj);
/* 113 */               OlO0OIIl1 olO0OIIl1 = ii1OIIlOi.I000O01llI0.I00000oIO;
/* 117 */               int i4 = 0;
/* 118 */               Ii1IiiOOOO ii1IiiOOOO = new Ii1IiiOOOO(ii1OIIlOi, iOoil1iiIilo, i4);
/* 123 */               IlOl01I111 ilOl01I111 = new IlOl01I111(i4);
/* 126 */               ilOl01I111.I00iiO = ii1IiiOOOO;
/* 128 */               ilOl01I111.I00iiI = olO0OIIl1;
/* 130 */               VarHandle.storeStoreFence();
/* 136 */               I0I1oi i0I1oi = new I0I1oi(i3, iOoil1iiIilo, 4);
/* 141 */               IlOlOlI0 ilOlOlI0 = new IlOlOlI0(i2);
/* 144 */               ilOlOlI0.I00iiI = ilOl01I111;
/* 146 */               ilOlOlI0.I00iiO = i0I1oi;
/* 148 */               VarHandle.storeStoreFence();
/* 155 */               I1iIil1I i1iIil1I = new I1iIil1I(obj2, iOoil1iiIilo, 12);
/* 160 */               IlOlOlI0 ilOlOlI02 = new IlOlOlI0(i4);
/* 163 */               ilOlOlI02.I00iiI = ilOlOlI0;
/* 165 */               ilOlOlI02.I00iiO = i1iIil1I;
/* 167 */               VarHandle.storeStoreFence();
/* 172 */               Ii1Io1loiI ii1Io1loiI = new Ii1Io1loiI(i4);
/* 175 */               ii1Io1loiI.I00iiI = ilOlOlI02;
/* 177 */               VarHandle.storeStoreFence();
/* 185 */               IlOioIoiI ilOioIoiII00000oOI = ilOli1oOI10l.I00000oOI(ii1Io1loiI, new IOIllll(ii1OIIlOi, iOoil1iiIilo, i2));
/* 189 */               this.I00iio = null;
/* 191 */               this.I00iiO = null;
/* 193 */               this.I00iiI = 3;
/* 197 */               if (!(ilOil1iooOO0 instanceof Oo10iolo)) {
/* 214 */                   throw ((Oo10iolo) ilOil1iooOO0).I00iOIl;
                        }
/* 199 */               Object objI00000oIO = ilOioIoiII00000oOI.I00000oIO(ilOil1iooOO0, this);
/* 203 */               if (objI00000oIO != ii0111o) {
/* 206 */                   objI00000oIO = ooiIlOl1iI;
                        }
                        return objI00000oIO == ii0111o ? ii0111o : ooiIlOl1iI;
                    }
/* 47 */            IlOil1iooOO0 ilOil1iooOO03 = (IlOil1iooOO0) this.I00iio;
/* 49 */            lIoii1l01l0i.I00000oOI(obj);
/* 52 */            ilOil1iooOO0 = ilOil1iooOO03;
/* 87 */            obj2 = (OlO00iO01io) obj;
/* 91 */            if (!(obj2 instanceof Ii11I1iOiIo)) {
/* 219 */               if (obj2 instanceof Ooi1ol) {
/* 247 */                   I000II.I001IO000("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
/* 14 */                    return null;
                        }
/* 223 */               if (obj2 instanceof OOlIilOIlOi1) {
/* 246 */                   throw ((OOlIilOIlOi1) obj2).I00000oOI;
                        }
/* 227 */               if (!(obj2 instanceof IlIo0ol0)) {
/* 232 */                   if (obj2 instanceof OIIl11) {
/* 234 */                       I000II.I001IO000("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
/* 14 */                        return null;
                            }
/* 238 */                   I000II.I00000oIO();
/* 14 */                    return null;
                        }
                    }
/* 94 */            Ii11I1iOiIo ii11I1iOiIo = (Ii11I1iOiIo) obj2;
/* 96 */            Object obj3 = ii11I1iOiIo.I00000oOI;
/* 98 */            this.I00iio = ilOil1iooOO0;
/* 100 */           this.I00iiO = ii11I1iOiIo;
/* 102 */           this.I00iiI = 2;
/* 108 */           if (ilOil1iooOO0.emit(obj3, this) != ii0111o) {
/* 113 */               OlO0OIIl1 olO0OIIl12 = ii1OIIlOi.I000O01llI0.I00000oIO;
/* 117 */               int i42 = 0;
/* 118 */               Ii1IiiOOOO ii1IiiOOOO2 = new Ii1IiiOOOO(ii1OIIlOi, iOoil1iiIilo, i42);
/* 123 */               IlOl01I111 ilOl01I1112 = new IlOl01I111(i42);
/* 126 */               ilOl01I1112.I00iiO = ii1IiiOOOO2;
/* 128 */               ilOl01I1112.I00iiI = olO0OIIl12;
/* 130 */               VarHandle.storeStoreFence();
/* 136 */               I0I1oi i0I1oi2 = new I0I1oi(i3, iOoil1iiIilo, 4);
/* 141 */               IlOlOlI0 ilOlOlI03 = new IlOlOlI0(i2);
/* 144 */               ilOlOlI03.I00iiI = ilOl01I1112;
/* 146 */               ilOlOlI03.I00iiO = i0I1oi2;
/* 148 */               VarHandle.storeStoreFence();
/* 155 */               I1iIil1I i1iIil1I2 = new I1iIil1I(obj2, iOoil1iiIilo, 12);
/* 160 */               IlOlOlI0 ilOlOlI022 = new IlOlOlI0(i42);
/* 163 */               ilOlOlI022.I00iiI = ilOlOlI03;
/* 165 */               ilOlOlI022.I00iiO = i1iIil1I2;
/* 167 */               VarHandle.storeStoreFence();
/* 172 */               Ii1Io1loiI ii1Io1loiI2 = new Ii1Io1loiI(i42);
/* 175 */               ii1Io1loiI2.I00iiI = ilOlOlI022;
/* 177 */               VarHandle.storeStoreFence();
/* 185 */               IlOioIoiI ilOioIoiII00000oOI2 = ilOli1oOI10l.I00000oOI(ii1Io1loiI2, new IOIllll(ii1OIIlOi, iOoil1iiIilo, i2));
/* 189 */               this.I00iio = null;
/* 191 */               this.I00iiO = null;
/* 193 */               this.I00iiI = 3;
/* 197 */               if (!(ilOil1iooOO0 instanceof Oo10iolo)) {
                        }
                    }
                }

                private final Object I001IO000(Object obj) throws Throwable {
/* 3 */             Ii1OIIlOi ii1OIIlOi = (Ii1OIIlOi) this.I00iio;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i = this.I00iiI;
/* 9 */             IOoil1iiIilo iOoil1iiIilo = null;
/* 11 */            if (i != 0) {
/* 13 */                if (i == 1) {
/* 15 */                    lIoii1l01l0i.I00000oOI(obj);
/* 18 */                    return obj;
                        }
/* 21 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                 return null;
                    }
/* 25 */            lIoii1l01l0i.I00000oOI(obj);
/* 30 */            Ii0110 ii0110 = (Ii0110) this.I00iiO;
/* 34 */            IOi10loi iOi10loi = new IOi10loi();
/* 39 */            OlO00iO01io olO00iO01ioI00000oOI = ii1OIIlOi.I000O01llI0.I00000oOI();
/* 45 */            if (olO00iO01ioI00000oOI instanceof Ii11I1iOiIo) {
/* 53 */                olO00iO01ioI00000oOI = new OIIl11(((Ii11I1iOiIo) olO00iO01ioI00000oOI).I00000oIO);
                    }
/* 61 */            IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00ilI0I1;
/* 63 */            Ii00l101O ii00l101OI00000oIO = ii0110.I00000oIO();
/* 67 */            O1l0oolOoioi o1l0oolOoioi = new O1l0oolOoioi();
/* 70 */            o1l0oolOoioi.I00000oIO = illiIl1l11O;
/* 72 */            o1l0oolOoioi.I00000oOI = iOi10loi;
/* 74 */            o1l0oolOoioi.I0000Il00O = olO00iO01ioI00000oOI;
/* 76 */            o1l0oolOoioi.I0000O = ii00l101OI00000oIO;
/* 78 */            VarHandle.storeStoreFence();
/* 81 */            iOliil ioliil = ii1OIIlOi.I000l1;
/* 87 */            Object objI000lI = ((IIIII1OI1) ioliil.I00iio).I000lI(o1l0oolOoioi);
/* 93 */            if (objI000lI instanceof IO10i1) {
/* 97 */                Throwable thI00000oOI = IO10lIoiO.I00000oOI((IO10l0l0) objI000lI);
/* 101 */               if (thI00000oOI == null) {
/* 110 */                   throw new IOIoIlIlO("Channel was closed normally", 1);
                        }
/* 110 */               throw thI00000oOI;
                    }
/* 113 */           if (objI000lI instanceof IO10l0l0) {
/* 156 */               I000II.I001IO000("Check failed.");
/* 9 */                 return null;
                    }
/* 127 */           if (((AtomicInteger) ((Oi1ol0llI) ioliil.I00ilI0I1).I00iiI).getAndIncrement() == 0) {
/* 141 */               iOi1II01i0.I0000O((Ii0110) ioliil.I00iiI, null, null, new O1iIlllIoo(ioliil, iOoil1iiIilo, 28), 3);
                    }
/* 144 */           this.I00iiI = 1;
/* 146 */           Object objI0010o = iOi10loi.I0010o(this);
                    return objI0010o == ii0111o ? ii0111o : objI0010o;
                }

                private final Object I001i1O0Ol(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 5 */             IOoil1iiIilo iOoil1iiIilo = null;
/* 7 */             if (i != 0) {
/* 9 */                 if (i == 1) {
/* 11 */                    lIoii1l01l0i.I00000oOI(obj);
/* 14 */                    return obj;
                        }
/* 17 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                 return null;
                    }
/* 21 */            lIoii1l01l0i.I00000oOI(obj);
/* 28 */            Ii1I1ooo10O0 ii1I1ooo10O0 = ((Ii1liIllli0) this.I00iiO).I00000oOI;
/* 41 */            I0O0il1iIl i0O0il1iIl = new I0O0il1iIl(this.I00iio, this.I00ilI0I1, iOoil1iiIilo, 6);
/* 44 */            this.I00iiI = 1;
/* 46 */            Object objI00000oIO = ii1I1ooo10O0.I00000oIO(i0O0il1iIl, this);
                    return objI00000oIO == ii0111o ? ii0111o : objI00000oIO;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 550 */                   return new I00oIiI10((OI0lOIiOIOOo) this.I00iiO, (OOIII1l) this.I00iio, (IiiOlIiio) obj2, iOoil1iiIilo, 0);
                        case 1:
/* 527 */                   I00oIiI10 i00oIiI10 = new I00oIiI10((IlliIl1l11O) this.I00iio, (O1iIlllIoo) obj2, iOoil1iiIilo, 1);
/* 530 */                   i00oIiI10.I00iiO = obj;
/* 532 */                   return i00oIiI10;
                        case 2:
/* 513 */                   return new I00oIiI10((IOO0IOIll) this.I00iiO, (String) this.I00iio, (IlliIl1l11O) obj2, iOoil1iiIilo, 2);
                        case 3:
/* 490 */                   I00oIiI10 i00oIiI102 = new I00oIiI10((AgentTools) obj2, iOoil1iiIilo, 3);
/* 493 */                   i00oIiI102.I00iio = obj;
/* 495 */                   return i00oIiI102;
                        case 4:
/* 480 */                   return new I00oIiI10((IlliIl1l11O) this.I00iiO, this.I00iio, (Ii0110) obj2, iOoil1iiIilo, 4);
                        case 5:
/* 460 */                   I00oIiI10 i00oIiI103 = new I00oIiI10((IllOOo00lI) this.I00iio, (IlliIl1l11O) obj2, iOoil1iiIilo, 5);
/* 463 */                   i00oIiI103.I00iiO = obj;
/* 465 */                   return i00oIiI103;
                        case 6:
/* 444 */                   I00oIiI10 i00oIiI104 = new I00oIiI10((Function3) this.I00iio, (I0l1OOl1l10) obj2, iOoil1iiIilo, 6);
/* 447 */                   i00oIiI104.I00iiO = obj;
/* 449 */                   return i00oIiI104;
                        case 7:
/* 428 */                   I00oIiI10 i00oIiI105 = new I00oIiI10((IlliOIilI) this.I00iio, (I0l1OOl1l10) obj2, iOoil1iiIilo, 7);
/* 431 */                   i00oIiI105.I00iiO = obj;
/* 433 */                   return i00oIiI105;
                        case 8:
/* 412 */                   I00oIiI10 i00oIiI106 = new I00oIiI10((OoI1iOl0IoI) this.I00iio, (OI10i0Il) obj2, iOoil1iiIilo, 8);
/* 415 */                   i00oIiI106.I00iiO = obj;
/* 417 */                   return i00oIiI106;
                        case 9:
/* 397 */                   return new I00oIiI10((I1iOI11ioi1) this.I00iiO, (Context) this.I00iio, (O1oIOiI11o0) obj2, iOoil1iiIilo, 9);
                        case 10:
/* 375 */                   return new I00oIiI10((OI10i0Il) this.I00iio, (Ol1OlloIO) obj2, iOoil1iiIilo, 10);
                        case 11:
/* 360 */                   return new I00oIiI10((Context) this.I00iiO, (Bitmap) this.I00iio, (OI10i0Il) obj2, iOoil1iiIilo, 11);
                        case 12:
/* 338 */                   return new I00oIiI10((OlO0OIIl1) this.I00iio, (Oo1o1iil) obj2, iOoil1iiIilo, 12);
                        case 13:
/* 323 */                   return new I00oIiI10((IliI0101O0Oi) this.I00iiO, (OI10i0Il) this.I00iio, (Oo1o1iil) obj2, iOoil1iiIilo, 13);
                        case 14:
/* 301 */                   return new I00oIiI10((Ol1o0O0O0) this.I00iiO, (II0IOO1i) this.I00iio, (OI10i0Il) obj2, iOoil1iiIilo, 14);
                        case 15:
/* 277 */                   I00oIiI10 i00oIiI107 = new I00oIiI10((IllOOo00lI) this.I00iio, (I10i01) obj2, iOoil1iiIilo, 15);
/* 280 */                   i00oIiI107.I00iiO = obj;
/* 282 */                   return i00oIiI107;
                        case 16:
/* 262 */                   return new I00oIiI10((II1o0111IO0) this.I00iiO, (Context) this.I00iio, (O1ol100o0O) obj2, iOoil1iiIilo, 16);
                        case 17:
/* 240 */                   return new I00oIiI10((III0OOl1) this.I00iiO, (OIIlIII0Ili) this.I00iio, (I01ii1IIl) obj2, iOoil1iiIilo, 17);
                        case PoseLandmark.RIGHT_PINKY:
/* 218 */                   return new I00oIiI10((IIil1o0olooo) obj2, iOoil1iiIilo, 18);
                        case PoseLandmark.LEFT_INDEX:
/* 207 */                   return new I00oIiI10((o01l1ioOo0) this.I00iiO, (String) this.I00iio, (IIilllloil1) obj2, iOoil1iiIilo, 19);
                        case PoseLandmark.RIGHT_INDEX:
/* 185 */                   return new I00oIiI10((IIo11l1iO) this.I00iiO, (String) this.I00iio, (I0lIllO) obj2, iOoil1iiIilo, 20);
                        case PoseLandmark.LEFT_THUMB:
/* 161 */                   I00oIiI10 i00oIiI108 = new I00oIiI10((IlOil1iooOO0) this.I00iio, (IO101i) obj2, iOoil1iiIilo, 21);
/* 164 */                   i00oIiI108.I00iiO = obj;
/* 166 */                   return i00oIiI108;
                        case PoseLandmark.RIGHT_THUMB:
/* 144 */                   I00oIiI10 i00oIiI109 = new I00oIiI10((Oil1IOoo1lI) this.I00iio, obj2, iOoil1iiIilo, 22);
/* 147 */                   i00oIiI109.I00iiO = obj;
/* 149 */                   return i00oIiI109;
                        case PoseLandmark.LEFT_HIP:
/* 131 */                   return new I00oIiI10((IO1OIo01l1) this.I00iio, (String) obj2, iOoil1iiIilo, 23);
                        case PoseLandmark.RIGHT_HIP:
/* 116 */                   return new I00oIiI10((IO1OIo01l1) this.I00iiO, (Conversation) this.I00iio, (String) obj2, iOoil1iiIilo, 24);
                        case PoseLandmark.LEFT_KNEE:
/* 94 */                    return new I00oIiI10((List) this.I00iiO, (O0o0I1i0O) this.I00iio, (OlO01l1oOil) obj2, iOoil1iiIilo, 25);
                        case PoseLandmark.RIGHT_KNEE:
/* 70 */                    I00oIiI10 i00oIiI1010 = new I00oIiI10((Ii1OIIlOi) obj2, iOoil1iiIilo, 26);
/* 73 */                    i00oIiI1010.I00iio = obj;
/* 75 */                    return i00oIiI1010;
                        case 27:
/* 57 */                    I00oIiI10 i00oIiI1011 = new I00oIiI10((Ii1OIIlOi) this.I00iio, (IlliIl1l11O) obj2, iOoil1iiIilo, 27);
/* 60 */                    i00oIiI1011.I00iiO = obj;
/* 62 */                    return i00oIiI1011;
                        case PoseLandmark.RIGHT_ANKLE:
/* 42 */                    return new I00oIiI10((Ii1liIllli0) this.I00iiO, (String) this.I00iio, (String) obj2, iOoil1iiIilo, 28);
                        default:
/* 18 */                    I00oIiI10 i00oIiI1012 = new I00oIiI10((IiI11iIOlOo1) this.I00iio, (IlliIl1l11O) obj2, iOoil1iiIilo, 29);
/* 21 */                    i00oIiI1012.I00iiO = obj;
/* 23 */                    return i00oIiI1012;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 453 */                   return ((I00oIiI10) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 1:
/* 438 */                   return ((I00oIiI10) create((O00OoO) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 2:
/* 423 */                   return ((I00oIiI10) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 3:
/* 408 */                   return ((I00oIiI10) create((String) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 4:
/* 393 */                   return ((I00oIiI10) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 5:
/* 378 */                   return ((I00oIiI10) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 6:
/* 363 */                   return ((I00oIiI10) create((Ii1loIll001) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 7:
/* 348 */                   return ((I00oIiI10) create((OIoi0IIoi) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 8:
/* 333 */                   return ((I00oIiI10) create((OOIoIlO) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 9:
/* 318 */                   return ((I00oIiI10) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 10:
/* 303 */                   return ((I00oIiI10) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 11:
/* 288 */                   return ((I00oIiI10) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 12:
/* 273 */                   return ((I00oIiI10) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 13:
/* 258 */                   return ((I00oIiI10) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 14:
/* 243 */                   return ((I00oIiI10) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 15:
/* 228 */                   return ((I00oIiI10) create((IlOil1ii) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 16:
/* 213 */                   return ((I00oIiI10) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 17:
/* 198 */                   return ((I00oIiI10) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_PINKY:
/* 183 */                   return ((I00oIiI10) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.LEFT_INDEX:
/* 168 */                   return ((I00oIiI10) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_INDEX:
/* 153 */                   return ((I00oIiI10) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.LEFT_THUMB:
/* 138 */                   return ((I00oIiI10) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_THUMB:
/* 123 */                   return ((I00oIiI10) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.LEFT_HIP:
/* 108 */                   return ((I00oIiI10) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_HIP:
/* 93 */                    return ((I00oIiI10) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.LEFT_KNEE:
/* 78 */                    return ((I00oIiI10) create((OoIlOii) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_KNEE:
/* 63 */                    return ((I00oIiI10) create((IlOil1iooOO0) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 27:
/* 48 */                    return ((I00oIiI10) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_ANKLE:
/* 33 */                    return ((I00oIiI10) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    return ((I00oIiI10) create((OiOiliiO) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:129:0x0301, code lost:
                
                    if (r1 == r13) goto L130;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:167:0x0445, code lost:
                
                    if (p000.I10i01.I00000oIO(r0, r1, null, null, null, r21, 14) != r9) goto L169;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:224:0x055d, code lost:
                
                    if (p000.ilOlI1o001Io.I00000oIO(r2, r0, r21) == r9) goto L231;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:284:0x0675, code lost:
                
                    if (r2.I000II(r1, r3, r6, r21) == r0) goto L285;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:393:0x08a0, code lost:
                
                    if (r2.invoke(r0, r21) == r1) goto L394;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:116:0x0244 A[DONT_GENERATE] */
                /* JADX WARN: Removed duplicated region for block: B:124:0x02a8 A[Catch: all -> 0x0191, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0191, blocks: (B:88:0x018a, B:131:0x0306, B:134:0x031c, B:138:0x0339, B:93:0x019b, B:121:0x029e, B:124:0x02a8, B:128:0x02c2, B:94:0x01a2, B:100:0x01cf, B:102:0x01d7, B:104:0x01f1, B:106:0x01f5, B:108:0x01f9, B:110:0x01ff, B:112:0x0208, B:113:0x0223, B:118:0x0277, B:97:0x01ad), top: B:414:0x0182 }] */
                /* JADX WARN: Removed duplicated region for block: B:128:0x02c2 A[Catch: all -> 0x0191, TRY_ENTER, TryCatch #2 {all -> 0x0191, blocks: (B:88:0x018a, B:131:0x0306, B:134:0x031c, B:138:0x0339, B:93:0x019b, B:121:0x029e, B:124:0x02a8, B:128:0x02c2, B:94:0x01a2, B:100:0x01cf, B:102:0x01d7, B:104:0x01f1, B:106:0x01f5, B:108:0x01f9, B:110:0x01ff, B:112:0x0208, B:113:0x0223, B:118:0x0277, B:97:0x01ad), top: B:414:0x0182 }] */
                /* JADX WARN: Removed duplicated region for block: B:75:0x0163  */
                /* JADX WARN: Removed duplicated region for block: B:79:0x016f  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0172  */
                /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.String] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object iOO01ol;
                    String str;
                    ClipData clipData;
                    ClipData.Item itemAt;
                    CharSequence text;
                    Oi0O100II11O oi0O100II11O;
                    float[] fArrI00000oIO;
                    Object objI0000oI00;
                    long j;
                    Object objI000OiO;
                    Object objI0000oI002;
                    float[] fArr;
                    Object objI0000oI003;
                    Object objI0010I0i;
/* 9 */             boolean z = false;
/* 9 */             boolean z2 = false;
/* 9 */             boolean z3 = false;
/* 9 */             boolean z4 = false;
/* 9 */             boolean z5 = false;
/* 10 */            int i = 1;
/* 11 */            IOoil1iiIilo string = null;
/* 11 */            string = null;
/* 11 */            string = null;
/* 11 */            string = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 2216 */                  Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 2218 */                  int i2 = this.I00iiI;
/* 2220 */                  if (i2 == 0) {
/* 2234 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2239 */                      OI0lOIiOIOOo oI0lOIiOIOOo = (OI0lOIiOIOOo) this.I00iiO;
/* 2243 */                      OOIII1l oOIII1l = (OOIII1l) this.I00iio;
/* 2245 */                      this.I00iiI = 1;
/* 2251 */                      if (oI0lOIiOIOOo.I00000oIO(oOIII1l, this) == ii0111o) {
/* 2253 */                          return ii0111o;
                                }
                            } else {
/* 2222 */                      if (i2 != 1) {
/* 2230 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 2224 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 2257 */                  IiiOlIiio iiiOlIiio = (IiiOlIiio) this.I00ilI0I1;
/* 2259 */                  if (iiiOlIiio != null) {
/* 2261 */                      iiiOlIiio.I00000oOI();
                            }
/* 2264 */                  return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 2153 */                  O00OoO o00OoO = (O00OoO) this.I00iiO;
/* 2155 */                  Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 2157 */                  int i3 = this.I00iiI;
/* 2159 */                  if (i3 == 0) {
/* 2179 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2184 */                      IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00iio;
/* 2186 */                      this.I00iiO = o00OoO;
/* 2188 */                      this.I00iiI = 1;
/* 2194 */                      if (illiIl1l11O.invoke(o00OoO, this) != ii0111o2) {
                                }
/* 2211 */                      return ii0111o2;
                            }
/* 2161 */                  if (i3 != 1) {
/* 2163 */                      if (i3 == 2) {
/* 2165 */                          lIoii1l01l0i.I00000oOI(obj);
/* 2213 */                          return OoiIlOl1iI.I00000oIO;
                                }
/* 2171 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                        return null;
                            }
/* 2175 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2199 */                  O1iIlllIoo o1iIlllIoo = (O1iIlllIoo) this.I00ilI0I1;
/* 2201 */                  this.I00iiO = o00OoO;
/* 2203 */                  this.I00iiI = 2;
                            break;
                        case 2:
/* 2055 */                  Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 2057 */                  int i4 = this.I00iiI;
/* 2059 */                  if (i4 == 0) {
/* 2075 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2080 */                      IOO0IOIll iOO0IOIll = (IOO0IOIll) this.I00iiO;
/* 2082 */                      this.I00iiI = 1;
/* 2092 */                      ClipData primaryClip = ((I0lOi1li1Ii) iOO0IOIll).I00000oIO.I00000oIO().getPrimaryClip();
/* 2104 */                      iOO01ol = primaryClip != null ? new IOO01ol(primaryClip) : null;
/* 2105 */                      if (iOO01ol == ii0111o3) {
/* 2107 */                          return ii0111o3;
                                }
                            } else {
/* 2061 */                      if (i4 != 1) {
/* 2071 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 2063 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2066 */                      iOO01ol = obj;
                            }
/* 2109 */                  IOO01ol iOO01ol2 = (IOO01ol) iOO01ol;
/* 2111 */                  if (iOO01ol2 != null && (clipData = iOO01ol2.I00000oIO) != null && (itemAt = clipData.getItemAt(0)) != null && (text = itemAt.getText()) != null) {
/* 2129 */                      string = text.toString();
                            }
/* 2133 */                  if (string != null && (str = (String) this.I00iio) != null) {
/* 2145 */                      ((IlliIl1l11O) this.I00ilI0I1).invoke(str, string);
                            }
/* 2148 */                  return OoiIlOl1iI.I00000oIO;
                        case 3:
/* 1962 */                  String str2 = (String) this.I00iio;
/* 1964 */                  Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 1966 */                  int i5 = this.I00iiI;
/* 1968 */                  if (i5 == 0) {
/* 1995 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2002 */                      IOi10loi iOi10loi = new IOi10loi();
/* 2005 */                      I0i1O01o001[] i0i1O01o001Arr = I0i1O01o001.I00iOIl;
/* 2007 */                      Oi0O100II11O oi0O100II11O2 = new Oi0O100II11O();
/* 2010 */                      oi0O100II11O2.I00000oIO = str2;
/* 2012 */                      oi0O100II11O2.I00000oOI = iOi10loi;
/* 2014 */                      VarHandle.storeStoreFence();
/* 1 */                         IO1010 io1010 = ((AgentTools) this.I00ilI0I1)._actionChannel;
/* 2025 */                      this.I00iio = null;
/* 2027 */                      this.I00iiO = oi0O100II11O2;
/* 2029 */                      this.I00iiI = 1;
/* 2035 */                      if (io1010.I00000oOI(this, oi0O100II11O2) != ii0111o4) {
/* 2038 */                          oi0O100II11O = oi0O100II11O2;
                                }
/* 2053 */                      return ii0111o4;
                            }
/* 1970 */                  if (i5 != 1) {
/* 1972 */                      if (i5 == 2) {
/* 1974 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1977 */                          return obj;
                                }
/* 1982 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                        return null;
                            }
/* 1989 */                  oi0O100II11O = (Oi0O100II11O) this.I00iiO;
/* 1991 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2039 */                  IOi10loi iOi10loi2 = oi0O100II11O.I00000oOI;
/* 2041 */                  this.I00iio = null;
/* 2043 */                  this.I00iiO = null;
/* 2045 */                  this.I00iiI = 2;
/* 2047 */                  Object objI0010o = iOi10loi2.I0010o(this);
/* 2051 */                  if (objI0010o != ii0111o4) {
/* 2054 */                      return objI0010o;
                            }
/* 2053 */                  return ii0111o4;
                        case 4:
/* 1908 */                  Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 1910 */                  int i6 = this.I00iiI;
/* 1912 */                  if (i6 == 0) {
/* 1926 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1931 */                      IlliIl1l11O illiIl1l11O2 = (IlliIl1l11O) this.I00iiO;
/* 1933 */                      Object obj2 = this.I00iio;
/* 1935 */                      this.I00iiI = 1;
/* 1941 */                      if (illiIl1l11O2.invoke(obj2, this) == ii0111o5) {
/* 1943 */                          return ii0111o5;
                                }
                            } else {
/* 1914 */                      if (i6 != 1) {
/* 1922 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 1916 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1954 */                  il001oo1.I00000oOI((Ii0110) this.I00ilI0I1, new I0l0IolO());
/* 1957 */                  return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 1839 */                  Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 1841 */                  int i7 = this.I00iiI;
/* 1843 */                  if (i7 == 0) {
/* 1857 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1862 */                      Ii0110 ii0110 = (Ii0110) this.I00iiO;
/* 1866 */                      OOo0ooi oOo0ooi = new OOo0ooi();
/* 1873 */                      Ii1Io1loiI ii1Io1loiII0000Il00O = lOIoiooI1i01.I0000Il00O((IllOOo00lI) this.I00iio);
/* 1881 */                      IlliIl1l11O illiIl1l11O3 = (IlliIl1l11O) this.I00ilI0I1;
/* 1883 */                      I0l0lIoI i0l0lIoI = new I0l0lIoI(z ? 1 : 0);
/* 1886 */                      i0l0lIoI.I00iiI = oOo0ooi;
/* 1888 */                      i0l0lIoI.I00iiO = ii0110;
/* 1890 */                      i0l0lIoI.I00iio = illiIl1l11O3;
/* 1892 */                      VarHandle.storeStoreFence();
/* 1895 */                      this.I00iiI = 1;
/* 1901 */                      if (ii1Io1loiII0000Il00O.I00000oIO(i0l0lIoI, this) == ii0111o6) {
/* 1903 */                          return ii0111o6;
                                }
                            } else {
/* 1845 */                      if (i7 != 1) {
/* 1853 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 1847 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1905 */                  return OoiIlOl1iI.I00000oIO;
                        case 6:
/* 1789 */                  Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 1791 */                  int i8 = this.I00iiI;
/* 1793 */                  if (i8 == 0) {
/* 1807 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1812 */                      Ii1loIll001 ii1loIll001 = (Ii1loIll001) this.I00iiO;
/* 1816 */                      Function3 function3 = (Function3) this.I00iio;
/* 1824 */                      I0l1I0I0i10I i0l1I0I0i10I = (I0l1I0I0i10I) ((I0l1OOl1l10) this.I00ilI0I1).I000o00OoI0I;
/* 1826 */                      this.I00iiI = 1;
/* 1832 */                      if (function3.invoke(i0l1I0I0i10I, ii1loIll001, this) == ii0111o7) {
/* 1834 */                          return ii0111o7;
                                }
                            } else {
/* 1795 */                      if (i8 != 1) {
/* 1803 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 1797 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1836 */                  return OoiIlOl1iI.I00000oIO;
                        case 7:
/* 1733 */                  Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 1735 */                  int i9 = this.I00iiI;
/* 1737 */                  if (i9 == 0) {
/* 1751 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1756 */                      OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) this.I00iiO;
/* 1760 */                      Ii1loIll001 ii1loIll0012 = (Ii1loIll001) oIoi0IIoi.I00iOIl;
/* 1762 */                      Object obj3 = oIoi0IIoi.I00iiI;
/* 1766 */                      IlliOIilI illiOIilI = (IlliOIilI) this.I00iio;
/* 1774 */                      I0l1I0I0i10I i0l1I0I0i10I2 = (I0l1I0I0i10I) ((I0l1OOl1l10) this.I00ilI0I1).I000o00OoI0I;
/* 1776 */                      this.I00iiI = 1;
/* 1782 */                      if (illiOIilI.I000l1(i0l1I0I0i10I2, ii1loIll0012, obj3, this) == ii0111o8) {
/* 1784 */                          return ii0111o8;
                                }
                            } else {
/* 1739 */                      if (i9 != 1) {
/* 1747 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 1741 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1786 */                  return OoiIlOl1iI.I00000oIO;
                        case 8:
/* 1666 */                  OoI1iOl0IoI ooI1iOl0IoI = (OoI1iOl0IoI) this.I00iio;
/* 1668 */                  Ii0111o ii0111o9 = Ii0111o.I00iOIl;
/* 1670 */                  int i10 = this.I00iiI;
/* 1672 */                  if (i10 == 0) {
/* 1686 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1691 */                      OOIoIlO oOIoIlO = (OOIoIlO) this.I00iiO;
/* 1698 */                      Ii1Io1loiI ii1Io1loiII0000Il00O2 = lOIoiooI1i01.I0000Il00O(new I10oIiiliil(ooI1iOl0IoI, z2 ? 1 : 0));
/* 1706 */                      OI10i0Il oI10i0Il = (OI10i0Il) this.I00ilI0I1;
/* 1708 */                      I0l0lIoI i0l0lIoI2 = new I0l0lIoI(i);
/* 1711 */                      i0l0lIoI2.I00iiI = oOIoIlO;
/* 1713 */                      i0l0lIoI2.I00iiO = ooI1iOl0IoI;
/* 1715 */                      i0l0lIoI2.I00iio = oI10i0Il;
/* 1717 */                      VarHandle.storeStoreFence();
/* 1720 */                      this.I00iiI = 1;
/* 1726 */                      if (ii1Io1loiII0000Il00O2.I00000oIO(i0l0lIoI2, this) == ii0111o9) {
/* 1728 */                          return ii0111o9;
                                }
                            } else {
/* 1674 */                      if (i10 != 1) {
/* 1682 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 1676 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1730 */                  return OoiIlOl1iI.I00000oIO;
                        case 9:
/* 1539 */                  Ii0111o ii0111o10 = Ii0111o.I00iOIl;
/* 1541 */                  int i11 = this.I00iiI;
/* 1543 */                  if (i11 == 0) {
/* 1563 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1570 */                      OlIl0i olIl0i = ((I1iOI11ioi1) this.I00iiO).I0000oI00;
/* 1572 */                      if (olIl0i != null) {
/* 1574 */                          this.I00iiI = 1;
/* 1580 */                          if (olIl0i.I001l0I00(this) != ii0111o10) {
                                    }
/* 1656 */                          return ii0111o10;
                                }
                            } else {
/* 1545 */                      if (i11 != 1) {
/* 1547 */                          if (i11 == 2) {
/* 1549 */                              lIoii1l01l0i.I00000oOI(obj);
/* 1658 */                              return OoiIlOl1iI.I00000oIO;
                                    }
/* 1555 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 1559 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1585 */                  I1iOI11ioi1 i1iOI11ioi1 = (I1iOI11ioi1) this.I00iiO;
                            synchronized (i1iOI11ioi1.I0001Ioi1lo) {
/* 1590 */                      ArrayList arrayList = i1iOI11ioi1.I0001Ioi1lo;
/* 1592 */                      int size = arrayList.size();
/* 1596 */                      short[] sArr = new short[size];
/* 1598 */                      for (int i12 = 0; i12 < size; i12++) {
/* 1610 */                          sArr[i12] = ((Number) arrayList.get(i12)).shortValue();
                                }
/* 1615 */                      fArrI00000oIO = liI0oli01O0.I00000oIO(sArr);
/* 1621 */                      i1iOI11ioi1.I0001Ioi1lo.clear();
                            }
/* 1625 */                  int length = fArrI00000oIO.length;
/* 1628 */                  I1iOI11ioi1 i1iOI11ioi12 = (I1iOI11ioi1) this.I00iiO;
/* 1630 */                  if (length == 0) {
/* 1634 */                      i1iOI11ioi12.I0000oI00("No audio recorded");
/* 1637 */                      return OoiIlOl1iI.I00000oIO;
                            }
/* 1642 */                  Context context = (Context) this.I00iio;
/* 1646 */                  O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00ilI0I1;
/* 1648 */                  this.I00iiI = 2;
                            break;
                        case 10:
/* 1480 */                  OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iio;
/* 1482 */                  Ii0111o ii0111o11 = Ii0111o.I00iOIl;
/* 1484 */                  int i13 = this.I00iiI;
/* 1486 */                  if (i13 == 0) {
/* 1504 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1511 */                      String str3 = (String) oI10i0Il2.getValue();
/* 1513 */                      if (str3 != null) {
/* 1517 */                          Ol1OlloIO ol1OlloIO = (Ol1OlloIO) this.I00ilI0I1;
/* 1519 */                          this.I00iiO = oI10i0Il2;
/* 1521 */                          this.I00iiI = 1;
/* 1529 */                          if (Ol1OlloIO.I00000oOI(ol1OlloIO, str3, this, 14) == ii0111o11) {
/* 1531 */                              return ii0111o11;
                                    }
                                }
/* 1536 */                      return OoiIlOl1iI.I00000oIO;
                            }
/* 1488 */                  if (i13 != 1) {
/* 1500 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                        return null;
                            }
/* 1492 */                  oI10i0Il2 = (OI10i0Il) this.I00iiO;
/* 1494 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1533 */                  oI10i0Il2.setValue(null);
/* 1536 */                  return OoiIlOl1iI.I00000oIO;
                        case 11:
/* 1404 */                  Ii0111o ii0111o12 = Ii0111o.I00iOIl;
/* 1406 */                  int i14 = this.I00iiI;
/* 1408 */                  if (i14 == 0) {
/* 1424 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1429 */                      Context context2 = (Context) this.I00iiO;
/* 1433 */                      Bitmap bitmap = (Bitmap) this.I00iio;
/* 1435 */                      this.I00iiI = 1;
/* 1437 */                      IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 1447 */                      objI0000oI00 = iOi1II01i0.I0000oI00(Ii1oo1ooill0.I00iiI, new I1iIil1I(context2, bitmap, string, 4), this);
/* 1451 */                      if (objI0000oI00 == ii0111o12) {
/* 1453 */                          return ii0111o12;
                                }
                            } else {
/* 1410 */                      if (i14 != 1) {
/* 1420 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 1412 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1415 */                      objI0000oI00 = obj;
                            }
/* 1472 */                  ((OI10i0Il) this.I00ilI0I1).setValue(((Boolean) objI0000oI00).booleanValue() ? "Saved to Pictures" : "Save failed");
/* 1475 */                  return OoiIlOl1iI.I00000oIO;
                        case 12:
/* 1292 */                  OlO0OIIl1 olO0OIIl1 = (OlO0OIIl1) this.I00iio;
/* 1297 */                  Oo1o1iil oo1o1iil = (Oo1o1iil) this.I00ilI0I1;
/* 1299 */                  Ii0111o ii0111o13 = Ii0111o.I00iOIl;
/* 1301 */                  int i15 = this.I00iiI;
                            try {
                            } catch (Throwable th) {
/* 1384 */                      if (!oo1o1iil.I00000oOI()) {
/* 1403 */                          throw th;
                                }
/* 1388 */                      I1oo01II0O11 i1oo01II0O11 = new I1oo01II0O11((Object) oo1o1iil, string, (int) (z3 ? 1 : 0));
/* 1391 */                      this.I00iiO = th;
/* 1393 */                      this.I00iiI = 3;
/* 1399 */                      if (ilOlI1o001Io.I00000oIO(olO0OIIl1, i1oo01II0O11, this) != ii0111o13) {
/* 1403 */                          throw th;
                                }
                            }
/* 1303 */                  if (i15 == 0) {
/* 1335 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1338 */                      Boolean bool = Boolean.TRUE;
/* 1340 */                      olO0OIIl1.getClass();
/* 1343 */                      olO0OIIl1.I000lI(null, bool);
/* 1346 */                      OI110lo oI110lo = OI110lo.I00iiO;
/* 1348 */                      this.I00iiI = 1;
/* 1354 */                      if (oo1o1iil.I0000Il00O(oI110lo, this) != ii0111o13) {
                                }
/* 1401 */                      return ii0111o13;
                            }
/* 1305 */                  if (i15 != 1) {
/* 1307 */                      if (i15 == 2) {
/* 1325 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1377 */                          return OoiIlOl1iI.I00000oIO;
                                }
/* 1309 */                      if (i15 != 3) {
/* 1313 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 1319 */                      Throwable th2 = (Throwable) this.I00iiO;
/* 1321 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1403 */                      throw th2;
                            }
/* 1329 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1361 */                  if (oo1o1iil.I00000oOI()) {
/* 1365 */                      I1oo01II0O11 i1oo01II0O112 = new I1oo01II0O11((Object) oo1o1iil, string, (int) (z4 ? 1 : 0));
/* 1368 */                      this.I00iiI = 2;
                                break;
                            }
/* 1377 */                  return OoiIlOl1iI.I00000oIO;
                        case 13:
/* 1200 */                  IliI0101O0Oi iliI0101O0Oi = (IliI0101O0Oi) this.I00iiO;
/* 1204 */                  Oo1o1iil oo1o1iil2 = (Oo1o1iil) this.I00ilI0I1;
/* 1208 */                  OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iio;
/* 1210 */                  Ii0111o ii0111o14 = Ii0111o.I00iOIl;
/* 1212 */                  int i16 = this.I00iiI;
/* 1214 */                  if (i16 == 0) {
/* 1228 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1235 */                      if (iliI0101O0Oi.I00000oOI()) {
/* 1239 */                          oI10i0Il3.setValue(Boolean.TRUE);
/* 1242 */                          OI110lo oI110lo2 = OI110lo.I00iiO;
/* 1244 */                          this.I00iiI = 1;
/* 1250 */                          if (oo1o1iil2.I0000Il00O(oI110lo2, this) == ii0111o14) {
/* 1252 */                              return ii0111o14;
                                    }
                                }
                            } else {
/* 1216 */                      if (i16 != 1) {
/* 1224 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 1218 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1264 */                  if (((Boolean) oI10i0Il3.getValue()).booleanValue() && oo1o1iil2.I00000oOI() && !iliI0101O0Oi.I00000oOI()) {
/* 1280 */                      oI10i0Il3.setValue(Boolean.FALSE);
/* 1283 */                      oo1o1iil2.I00000oIO();
                            }
/* 1286 */                  return OoiIlOl1iI.I00000oIO;
                        case 14:
/* 1105 */                  Ii1liIllli0 ii1liIllli0 = ((II0IOO1i) this.I00iio).I0000Il00O;
/* 1107 */                  Ii0111o ii0111o15 = Ii0111o.I00iOIl;
/* 1109 */                  int i17 = this.I00iiI;
/* 1111 */                  if (i17 == 0) {
/* 1125 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1136 */                      if (((Ol1o0O0O0) this.I00iiO).size() > 1) {
/* 1138 */                          ii1liIllli0.getClass();
/* 1159 */                          if (!((Boolean) iOi1IOoIO0l.I00000oIO(Il00o11.I00iOIl, new Ii1l100(ii1liIllli0, string, 7))).booleanValue()) {
/* 1161 */                              this.I00iiI = 1;
/* 1169 */                              if (il0l1o1l.I00000oOI(500L, this) == ii0111o15) {
/* 1171 */                                  return ii0111o15;
                                        }
                                    }
                                }
/* 1195 */                      return OoiIlOl1iI.I00000oIO;
                            }
/* 1113 */                  if (i17 != 1) {
/* 1121 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                        return null;
                            }
/* 1115 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1179 */                  ((OI10i0Il) this.I00ilI0I1).setValue(Boolean.TRUE);
/* 1182 */                  ii1liIllli0.getClass();
/* 1192 */                  iOi1IOoIO0l.I00000oOI(new Ii1l100(ii1liIllli0, string, 16));
/* 1195 */                  return OoiIlOl1iI.I00000oIO;
                        case 15:
/* 1011 */                  Ii0111o ii0111o16 = Ii0111o.I00iOIl;
/* 1013 */                  int i18 = this.I00iiI;
                            try {
                            } catch (CancellationException unused) {
/* 1075 */                      I10i01 i10i01 = (I10i01) this.I00ilI0I1;
/* 1080 */                      Float f = new Float(0.0f);
/* 1083 */                      this.I00iiI = 2;
                                break;
                            }
/* 1015 */                  if (i18 == 0) {
/* 1035 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1040 */                      IlOil1ii ilOil1ii = (IlOil1ii) this.I00iiO;
/* 1046 */                      I10i01 i10i012 = (I10i01) this.I00ilI0I1;
/* 1048 */                      I0oOII1l i0oOII1l = new I0oOII1l(i);
/* 1051 */                      i0oOII1l.I00iiI = i10i012;
/* 1053 */                      VarHandle.storeStoreFence();
/* 1056 */                      this.I00iiI = 1;
/* 1062 */                      if (ilOil1ii.I00000oIO(i0oOII1l, this) == ii0111o16) {
/* 1096 */                          return ii0111o16;
                                }
                            } else {
/* 1017 */                      if (i18 != 1) {
/* 1019 */                          if (i18 == 2) {
/* 1021 */                              lIoii1l01l0i.I00000oOI(obj);
/* 1098 */                              return OoiIlOl1iI.I00000oIO;
                                    }
/* 1027 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 1031 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1069 */                  ((IllOOo00lI) this.I00iio).invoke();
/* 1098 */                  return OoiIlOl1iI.I00000oIO;
                        case 16:
/* 379 */                   OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 383 */                   Ii0111o ii0111o17 = Ii0111o.I00iOIl;
/* 385 */                   int i19 = this.I00iiI;
                            try {
                            } catch (Throwable th3) {
                                try {
/* 902 */                           Log.e("BoxAssistVM", "voice question failed", th3);
/* 913 */                           ((II1o0111IO0) this.I00iiO).I000O01llI0.I00000oOI("Sorry, the voice question failed.");
/* 920 */                           ((II1o0111IO0) this.I00iiO).I000iOII = false;
/* 936 */                           if (!((II1l1O1oi01) ((II1o0111IO0) this.I00iiO).I0000Il00O.getValue()).I0000oI00) {
                                    }
                                } finally {
/* 946 */                           ((II1o0111IO0) this.I00iiO).I000iOII = false;
/* 962 */                           if (!((II1l1O1oi01) ((II1o0111IO0) this.I00iiO).I0000Il00O.getValue()).I0000oI00) {
/* 968 */                               OlO0OIIl1 olO0OIIl12 = ((II1o0111IO0) this.I00iiO).I0000Il00O;
/* 1007 */                              olO0OIIl12.I000lI(null, II1l1O1oi01.I00000oIO((II1l1O1oi01) olO0OIIl12.getValue(), null, false, ((II1l1O1oi01) ((II1o0111IO0) this.I00iiO).I0000Il00O.getValue()).I00000oIO.I00iOIl.concat(" mode"), null, false, 27));
                                    }
                                }
                            }
/* 387 */                   if (i19 == 0) {
/* 427 */                       lIoii1l01l0i.I00000oOI(obj);
/* 432 */                       II1o0111IO0 iI1o0111IO0 = (II1o0111IO0) this.I00iiO;
/* 436 */                       Context context3 = (Context) this.I00iio;
/* 438 */                       j = 0;
/* 452 */                       O1oiOloOo o1oiOloOo = (O1oiOloOo) ((O1ol100o0O) this.I00ilI0I1).I000OOo1O.I00iOIl.getValue();
/* 454 */                       this.I00iiI = 1;
/* 456 */                       objI000OiO = iI1o0111IO0.I000OiO(context3, o1oiOloOo, this);
/* 460 */                       if (objI000OiO == ii0111o17) {
                                }
/* 772 */                       return ii0111o17;
                            }
/* 389 */                   if (i19 == 1) {
/* 419 */                       lIoii1l01l0i.I00000oOI(obj);
/* 422 */                       j = 0;
/* 424 */                       objI000OiO = obj;
                            } else {
/* 391 */                       if (i19 != 2) {
/* 393 */                           if (i19 != 3) {
/* 407 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                                return null;
                                    }
/* 395 */                           lIoii1l01l0i.I00000oOI(obj);
/* 398 */                           objI0000oI003 = obj;
/* 783 */                           String string2 = OlOoOIi0o.I00OIo(((Oil1oo000i) objI0000oI003).I00000oIO).toString();
/* 787 */                           int length2 = string2.length();
/* 793 */                           II1o0111IO0 iI1o0111IO02 = (II1o0111IO0) this.I00iiO;
/* 795 */                           if (length2 == 0) {
/* 799 */                               iI1o0111IO02.I000O01llI0.I00000oOI("I didn't catch that. Double tap, then speak your question.");
/* 806 */                               ((II1o0111IO0) this.I00iiO).I000iOII = false;
/* 822 */                               if (!((II1l1O1oi01) ((II1o0111IO0) this.I00iiO).I0000Il00O.getValue()).I0000oI00) {
                                        }
                                    } else {
/* 826 */                               OlO0OIIl1 olO0OIIl13 = iI1o0111IO02.I0000Il00O;
/* 850 */                               olO0OIIl13.I000lI(null, II1l1O1oi01.I00000oIO((II1l1O1oi01) olO0OIIl13.getValue(), null, false, null, "Q: ".concat(string2), false, 23));
/* 857 */                               ((II1o0111IO0) this.I00iiO).I000iOII = false;
/* 871 */                               ((II1o0111IO0) this.I00iiO).I000OOo1O((Context) this.I00iio, (O1ol100o0O) this.I00ilI0I1, string2);
/* 878 */                               ((II1o0111IO0) this.I00iiO).I000iOII = false;
/* 894 */                               if (!((II1l1O1oi01) ((II1o0111IO0) this.I00iiO).I0000Il00O.getValue()).I0000oI00) {
                                        }
                                    }
/* 629 */                           return ooiIlOl1iI;
                                }
/* 412 */                       lIoii1l01l0i.I00000oOI(obj);
/* 415 */                       objI0000oI002 = obj;
/* 671 */                       fArr = (float[]) objI0000oI002;
/* 677 */                       I1OI0i1lo i1OI0i1lo = ((II1o0111IO0) this.I00iiO).I000O01llI0;
/* 679 */                       if (fArr != null) {
/* 681 */                           i1OI0i1lo.I00000oOI("I didn't catch that. Double tap, then speak your question.");
/* 688 */                           ((II1o0111IO0) this.I00iiO).I000iOII = false;
/* 704 */                           if (!((II1l1O1oi01) ((II1o0111IO0) this.I00iiO).I0000Il00O.getValue()).I0000oI00) {
                                    }
/* 629 */                           return ooiIlOl1iI;
                                }
/* 712 */                       i1OI0i1lo.I0000Il00O(new long[]{0, 25});
/* 719 */                       OlO0OIIl1 olO0OIIl14 = ((II1o0111IO0) this.I00iiO).I0000Il00O;
/* 743 */                       olO0OIIl14.I000lI(null, II1l1O1oi01.I00000oIO((II1l1O1oi01) olO0OIIl14.getValue(), null, false, "Understanding…", null, false, 27));
/* 750 */                       Oil1lO oil1lO = ((II1o0111IO0) this.I00iiO).I000OOo1O;
/* 752 */                       this.I00iiI = 3;
/* 754 */                       oil1lO.getClass();
/* 766 */                       objI0000oI003 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new O00lOIIO(oil1lO, fArr, string, 27), this);
                                break;
                            }
/* 470 */                   if (((Boolean) objI000OiO).booleanValue()) {
/* 636 */                       II1iIoli iI1iIoli = ((II1o0111IO0) this.I00iiO).I000OiO;
/* 642 */                       Context context4 = (Context) this.I00iio;
/* 644 */                       this.I00iiI = 2;
/* 646 */                       iI1iIoli.getClass();
/* 649 */                       IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 664 */                       objI0000oI002 = iOi1II01i0.I0000oI00(Ii1oo1ooill0.I00iiI, new II1iIl0Ililo(iI1iIoli, context4, 8000, 1200, null), this);
/* 668 */                       if (objI0000oI002 != ii0111o17) {
/* 671 */                           fArr = (float[]) objI0000oI002;
/* 677 */                           I1OI0i1lo i1OI0i1lo2 = ((II1o0111IO0) this.I00iiO).I000O01llI0;
/* 679 */                           if (fArr != null) {
                                    }
                                }
/* 772 */                       return ii0111o17;
                            }
/* 494 */                   O1oIo0iI00 o1oIo0iI00 = (O1oIo0iI00) ((O1oiOloOo) ((O1ol100o0O) this.I00ilI0I1).I000OOo1O.I00iOIl.getValue()).I0000Il00O.get("SenseVoice (multilingual)");
/* 504 */                   if ((o1oIo0iI00 != null ? o1oIo0iI00.I00000oIO : null) == ModelDownloadStatusType.IN_PROGRESS) {
/* 506 */                       long j2 = o1oIo0iI00.I00000oOI;
/* 520 */                       int i20 = j2 > j ? (int) ((o1oIo0iI00.I0000Il00O * 100) / j2) : 0;
/* 544 */                       ((II1o0111IO0) this.I00iiO).I000O01llI0.I00000oOI("Still downloading the speech model, " + i20 + " percent done. Try again in a bit.");
                            } else {
/* 556 */                       ((II1o0111IO0) this.I00iiO).I000O01llI0.I00000oOI("No speech model is downloaded. Download the SenseVoice model to ask questions.");
                            }
/* 629 */                   return ooiIlOl1iI;
                        case 17:
/* 136 */                   OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 140 */                   III0OOl1 iII0OOl1 = (III0OOl1) this.I00iiO;
/* 142 */                   Ii0111o ii0111o18 = Ii0111o.I00iOIl;
/* 144 */                   int i21 = this.I00iiI;
/* 146 */                   if (i21 == 0) {
/* 163 */                       lIoii1l01l0i.I00000oOI(obj);
/* 166 */                       IOoO1ol1 iOoO1ol1 = iII0OOl1.I00o0iI0io1;
/* 178 */                       III0O0o0Iil iII0O0o0Iil = new III0O0o0Iil(iII0OOl1, (OIIlIII0Ili) this.I00iio, (I01ii1IIl) this.I00ilI0I1);
/* 181 */                       this.I00iiI = 1;
/* 183 */                       iOoO1ol1.getClass();
/* 191 */                       OOo0IO oOo0IO = (OOo0IO) iII0O0o0Iil.invoke();
/* 193 */                       if (oOo0IO == null || IOoO1ol1.I010lI0oi(iOoO1ol1, oOo0IO, 0L, 0L, 3)) {
/* 368 */                           objI0010I0i = ooiIlOl1iI2;
/* 369 */                           if (objI0010I0i == ii0111o18) {
/* 371 */                               return ii0111o18;
                                    }
                                } else {
/* 212 */                           IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(this));
/* 215 */                           iIoOoIol0Io0.I00111O();
/* 220 */                           IOoO0I1OIoi iOoO0I1OIoi = new IOoO0I1OIoi();
/* 223 */                           iOoO0I1OIoi.I00000oIO = iII0O0o0Iil;
/* 225 */                           iOoO0I1OIoi.I00000oOI = iIoOoIol0Io0;
/* 227 */                           VarHandle.storeStoreFence();
/* 230 */                           Oi00IilOloo0 oi00IilOloo0 = iOoO1ol1.I00oIiI10;
/* 234 */                           OI110O0 oi110o0 = (OI110O0) oi00IilOloo0.I00iOIl;
/* 240 */                           OOo0IO oOo0IO2 = (OOo0IO) iII0O0o0Iil.invoke();
/* 242 */                           if (oOo0IO2 == null) {
/* 244 */                               iIoOoIol0Io0.resumeWith(ooiIlOl1iI2);
                                    } else {
/* 253 */                               I00o101lO i00o101lO = new I00o101lO(22);
/* 256 */                               i00o101lO.I00iiI = oi00IilOloo0;
/* 258 */                               i00o101lO.I00iiO = iOoO0I1OIoi;
/* 260 */                               VarHandle.storeStoreFence();
/* 263 */                               iIoOoIol0Io0.I001IO000(i00o101lO);
/* 268 */                               IooO11l iooO11lI000O01llI0 = lIiioliIlo.I000O01llI0(0, oi110o0.I00iiO);
/* 272 */                               int i22 = iooO11lI000O01llI0.I00iOIl;
/* 274 */                               int i23 = iooO11lI000O01llI0.I00iiI;
/* 276 */                               if (i22 <= i23) {
                                            while (true) {
/* 290 */                                       OOo0IO oOo0IO3 = (OOo0IO) ((IOoO0I1OIoi) oi110o0.I00iOIl[i23]).I00000oIO.invoke();
/* 292 */                                       if (oOo0IO3 != null) {
/* 295 */                                           OOo0IO oOo0IOI0001Ioi1lo = oOo0IO2.I0001Ioi1lo(oOo0IO3);
/* 303 */                                           if (oOo0IOI0001Ioi1lo.equals(oOo0IO2)) {
/* 306 */                                               oi110o0.I00000oIO(i23 + 1, iOoO0I1OIoi);
                                                    } else if (!oOo0IOI0001Ioi1lo.equals(oOo0IO3)) {
/* 320 */                                               CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
/* 325 */                                               int i24 = oi110o0.I00iiO - 1;
/* 326 */                                               if (i24 <= i23) {
                                                            while (true) {
/* 336 */                                                       ((IOoO0I1OIoi) oi110o0.I00iOIl[i23]).I00000oOI.I0000O(cancellationException);
/* 339 */                                                       if (i24 != i23) {
/* 341 */                                                           i24++;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
/* 344 */                                       if (i23 != i22) {
                                                    i23--;
                                                }
                                            }
/* 354 */                                   if (!iOoO1ol1.I00ol1) {
/* 356 */                                       iOoO1ol1.I010o0o0oO(0L);
                                            }
                                        } else {
/* 349 */                                   oi110o0.I00000oIO(0, iOoO0I1OIoi);
/* 354 */                                   if (!iOoO1ol1.I00ol1) {
                                            }
                                        }
                                    }
/* 359 */                           objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 365 */                           if (objI0010I0i != Ii0111o.I00iOIl) {
                                    }
/* 369 */                           if (objI0010I0i == ii0111o18) {
                                    }
                                }
                            } else {
/* 148 */                       if (i21 != 1) {
/* 158 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 150 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 153 */                   return ooiIlOl1iI2;
                        case PoseLandmark.RIGHT_PINKY:
/* 131 */                   return I00000oIO(obj);
                        case PoseLandmark.LEFT_INDEX:
/* 126 */                   return I000II(obj);
                        case PoseLandmark.RIGHT_INDEX:
/* 121 */                   return I000O01llI0(obj);
                        case PoseLandmark.LEFT_THUMB:
/* 116 */                   return I000iOII(obj);
                        case PoseLandmark.RIGHT_THUMB:
/* 111 */                   return I000lI(obj);
                        case PoseLandmark.LEFT_HIP:
/* 106 */                   return I000o00OoI0I(obj);
                        case PoseLandmark.RIGHT_HIP:
/* 101 */                   return I00100l0(obj);
                        case PoseLandmark.LEFT_KNEE:
/* 96 */                    return I00111O(obj);
                        case PoseLandmark.RIGHT_KNEE:
/* 91 */                    return I001IIilI0O(obj);
                        case 27:
/* 86 */                    return I001IO000(obj);
                        case PoseLandmark.RIGHT_ANKLE:
/* 81 */                    return I001i1O0Ol(obj);
                        default:
/* 19 */                    OIooliIO0 oIooliIO0 = ((IiI11iIOlOo1) this.I00iio).I0000O;
/* 21 */                    Ii0111o ii0111o19 = Ii0111o.I00iOIl;
/* 23 */                    int i25 = this.I00iiI;
                            try {
/* 25 */                        if (i25 == 0) {
/* 41 */                            lIoii1l01l0i.I00000oOI(obj);
/* 46 */                            OiOiliiO oiOiliiO = (OiOiliiO) this.I00iiO;
/* 50 */                            oIooliIO0.setValue(Boolean.TRUE);
/* 55 */                            IlliIl1l11O illiIl1l11O4 = (IlliIl1l11O) this.I00ilI0I1;
/* 57 */                            this.I00iiI = 1;
/* 63 */                            if (illiIl1l11O4.invoke(oiOiliiO, this) == ii0111o19) {
/* 65 */                                return ii0111o19;
                                    }
                                } else {
/* 27 */                            if (i25 != 1) {
/* 37 */                                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                                return null;
                                    }
/* 29 */                            lIoii1l01l0i.I00000oOI(obj);
                                }
/* 69 */                        oIooliIO0.setValue(Boolean.FALSE);
/* 72 */                        return OoiIlOl1iI.I00000oIO;
                            } catch (Throwable th4) {
/* 77 */                        oIooliIO0.setValue(Boolean.FALSE);
/* 80 */                        throw th4;
                            }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public I00oIiI10(Object obj, Object obj2, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 14 */            this.I00iOIl = i;
                    this.I00iio = obj;
                    this.I00ilI0I1 = obj2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public I00oIiI10(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 15 */            this.I00iOIl = i;
                    this.I00ilI0I1 = obj;
                }
            }
