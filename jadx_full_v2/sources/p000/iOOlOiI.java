            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Iterator;
            
            public abstract class iOOlOiI {
                /* JADX WARN: Multi-variable type inference failed */
                public static final Object I00000oIO(Collection collection, IOoilo iOoilo) {
/* 5 */             if (collection.isEmpty()) {
/* 7 */                 return Il01100l.I00iOIl;
                    }
/* 19 */            IiIOI1ol0o[] iiIOI1ol0oArr = (IiIOI1ol0o[]) collection.toArray(new IiIOI1ol0o[0]);
/* 21 */            I1liIOOo0i i1liIOOo0i = new I1liIOOo0i(iiIOI1ol0oArr);
/* 31 */            IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(iOoilo));
/* 34 */            iIoOoIol0Io0.I00111O();
/* 37 */            int length = iiIOI1ol0oArr.length;
/* 38 */            I1li0oll1lI1[] i1li0oll1lI1Arr = new I1li0oll1lI1[length];
/* 41 */            for (int i = 0; i < length; i++) {
/* 43 */                O0ioiIilI o0ioiIilI = iiIOI1ol0oArr[i];
/* 48 */                o0ioiIilI.start();
/* 53 */                I1li0oll1lI1 i1li0oll1lI1 = new I1li0oll1lI1(i1liIOOo0i, iIoOoIol0Io0);
/* 60 */                i1li0oll1lI1.I00ilO0 = l01oO1iOo.I0001Ioi1lo(o0ioiIilI, true, i1li0oll1lI1);
/* 62 */                i1li0oll1lI1Arr[i] = i1li0oll1lI1;
                    }
/* 69 */            I1liIO1Il1 i1liIO1Il1 = new I1liIO1Il1();
/* 72 */            i1liIO1Il1.I00iOIl = i1li0oll1lI1Arr;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            for (int i2 = 0; i2 < length; i2++) {
/* 79 */                I1li0oll1lI1 i1li0oll1lI12 = i1li0oll1lI1Arr[i2];
/* 81 */                i1li0oll1lI12.getClass();
/* 88 */                I1Ioolli0l0o.I00000oIO.putObjectVolatile(i1li0oll1lI12, I1li0oll1lI1.I00ioIO, i1liIO1Il1);
                    }
/* 100 */           if (iIoOoIol0Io0.I0010o() instanceof OIIoiiOIil00) {
/* 106 */               iIoOoIol0Io0.I001i1O0Ol(i1liIO1Il1);
                    } else {
/* 102 */               i1liIO1Il1.I00000oIO();
                    }
/* 109 */           Object objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 113 */           Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 551 */           return objI0010I0i;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oOI(Collection collection, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    I1liOoi i1liOoi;
                    Iterator it;
                    int i;
/* 3 */             if (iOoil1iiIilo instanceof I1liOoi) {
/* 6 */                 i1liOoi = (I1liOoi) iOoil1iiIilo;
/* 8 */                 int i2 = i1liOoi.I00iio;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    i1liOoi.I00iio = i2 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    i1liOoi = new I1liOoi(iOoil1iiIilo);
                        }
                    }
/* 25 */            Object obj = i1liOoi.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i3 = i1liOoi.I00iio;
/* 32 */            if (i3 == 0) {
/* 51 */                lIoii1l01l0i.I00000oOI(obj);
/* 56 */                it = collection.iterator();
/* 62 */                i = 0;
                    } else {
/* 34 */                if (i3 != 1) {
/* 46 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 49 */                    return null;
                        }
/* 36 */                i = i1liOoi.I00iiI;
/* 38 */                it = i1liOoi.I00iOIl;
/* 40 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 67 */            while (it.hasNext()) {
/* 73 */                O010OIi o010OIi = (O010OIi) it.next();
/* 75 */                i1liOoi.I00iOIl = it;
/* 77 */                i1liOoi.I00iiI = i;
/* 79 */                i1liOoi.I00iio = 1;
/* 85 */                if (o010OIi.I001l0I00(i1liOoi) == ii0111o) {
/* 87 */                    return ii0111o;
                        }
                    }
/* 88 */            return OoiIlOl1iI.I00000oIO;
                }
            }
