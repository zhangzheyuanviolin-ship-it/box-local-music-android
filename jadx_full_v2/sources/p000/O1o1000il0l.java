            package p000;

            import com.google.ai.edge.litertlm.Content;
            import com.google.ai.edge.litertlm.Contents;
            import com.google.ai.edge.litertlm.Conversation;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            
            public final class O1o1000il0l extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public final String I00iiI;
                public final O1o10Iiio I00iiO;
                public final O1oIOiI11o0 I00iio;
                public final Io0IOO01iIO1 I00ilI0I1;
                public final I0IlIoI1oi0 I00ilO0;
                public final List I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1o1000il0l(String str, O1o10Iiio o1o10Iiio, O1oIOiI11o0 o1oIOiI11o0, Io0IOO01iIO1 io0IOO01iIO1, I0IlIoI1oi0 i0IlIoI1oi0, List list, IOoil1iiIilo iOoil1iiIilo) {
/* 14 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = str;
/* 3 */             this.I00iiO = o1o10Iiio;
/* 5 */             this.I00iio = o1oIOiI11o0;
/* 7 */             this.I00ilI0I1 = io0IOO01iIO1;
/* 9 */             this.I00ilO0 = i0IlIoI1oi0;
/* 11 */            this.I00io1l = list;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 16 */            return new O1o1000il0l(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((O1o1000il0l) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x00a1, code lost:
                
                    if (r14.I00000oIO(r1, r13) == r0) goto L18;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 5 */             String str = this.I00iiI;
/* 10 */            O1o10Iiio o1o10Iiio = this.I00iiO;
/* 12 */            if (i == 0) {
/* 33 */                lIoii1l01l0i.I00000oOI(obj);
/* 36 */                o1o10Iiio.I000OOo1O(true);
/* 40 */                o1o10Iiio.I000OiO(false);
/* 43 */                o1o10Iiio.I000II();
/* 46 */                o1o10Iiio.I000O01llI0(false);
/* 49 */                o1o10Iiio.I0000oI00();
/* 52 */                o1o10Iiio.I000iOII(str);
/* 55 */                OOli1O oOli1O = o1o10Iiio.I0001Ioi1lo;
/* 59 */                O1o0oloi0il o1o0oloi0il = new O1o0oloi0il(2, null);
/* 62 */                this.I00iOIl = 1;
/* 68 */                if (ilOoO00.I00000oOI(oOli1O, o1o0oloi0il, this) != ii0111o) {
                        }
/* 164 */               return ii0111o;
                    }
/* 14 */            if (i != 1) {
/* 16 */                if (i == 2) {
/* 18 */                    lIoii1l01l0i.I00000oOI(obj);
/* 165 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 25 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                 return null;
                    }
/* 29 */            lIoii1l01l0i.I00000oOI(obj);
/* 77 */            Conversation conversation = ((O11illi) this.I00iio.I00IlilI0i0i).I00000oOI;
/* 81 */            ArrayList arrayList = new ArrayList();
/* 96 */            if (OlOoOIi0o.I00OIo(str).toString().length() > 0) {
/* 103 */               arrayList.add(new Content.Text(str));
                    }
/* 141 */           IlOioIoiI ilOioIoiII00000oOI = ilOli1oOI10l.I00000oOI(ilOo1lI1o10.I00000oIO(Conversation.sendMessageAsync$default(conversation, Contents.INSTANCE.of(arrayList), (Map) null, 2, (Object) null), new Ii1iii100O1O(this.I00ilI0I1, null, 2)), new IoO01oi(this.I00iiO, this.I00ilO0, this.I00iio, this.I00io1l, null));
/* 148 */           I0oOII1l i0oOII1l = new I0oOII1l(6);
/* 151 */           i0oOII1l.I00iiI = o1o10Iiio;
/* 153 */           VarHandle.storeStoreFence();
/* 156 */           this.I00iOIl = 2;
                }
            }
