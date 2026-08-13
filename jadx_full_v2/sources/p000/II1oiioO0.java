            package p000;

            import com.google.ai.edge.litertlm.Content;
            import com.google.ai.edge.litertlm.Contents;
            import com.google.ai.edge.litertlm.Conversation;
            import com.google.ai.edge.litertlm.ConversationConfig;
            import com.google.ai.edge.litertlm.Engine;
            import com.google.ai.edge.litertlm.SamplerConfig;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            
            public final class II1oiioO0 extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public Object I00iiI;
                public final I1I0i0Ilo1Oi I00iiO;
                public final String I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public II1oiioO0(I1I0i0Ilo1Oi i1I0i0Ilo1Oi, String str, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iiO = i1I0i0Ilo1Oi;
/* 3 */             this.I00iio = str;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 7 */             II1oiioO0 iI1oiioO0 = new II1oiioO0(this.I00iiO, this.I00iio, iOoil1iiIilo);
/* 10 */            iI1oiioO0.I00iiI = obj;
/* 37 */            return iI1oiioO0;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((II1oiioO0) create((OOIoOo0O) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 5 */             OOIoOo0O oOIoOo0O = (OOIoOo0O) this.I00iiI;
/* 7 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 9 */             int i = this.I00iOIl;
/* 13 */            if (i == 0) {
/* 27 */                lIoii1l01l0i.I00000oOI(obj);
/* 75 */                Conversation conversationCreateConversation = ((Engine) ((OllO00oiil) this.I00iiO.I00iiO).getValue()).createConversation(new ConversationConfig(null, null, null, new SamplerConfig(40, 0.9d, 0.7d, 0), false, null, null, 119, null));
/* 92 */                Contents contentsOf = Contents.INSTANCE.of(Collections.singletonList(new Content.Text(this.I00iio)));
/* 100 */               Oi0Oooi oi0Oooi = new Oi0Oooi(4, false);
/* 103 */               oi0Oooi.I00iiI = oOIoOo0O;
/* 105 */               VarHandle.storeStoreFence();
/* 110 */               conversationCreateConversation.sendMessageAsync(contentsOf, oi0Oooi, Il011I1OiO0I.I00iOIl);
/* 117 */               I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(11);
/* 120 */               i0OIOO00l0O.I00iiI = conversationCreateConversation;
/* 122 */               VarHandle.storeStoreFence();
/* 125 */               this.I00iiI = null;
/* 127 */               this.I00iOIl = 1;
/* 133 */               if (lIIl0IOilo0.I00000oIO(oOIoOo0O, i0OIOO00l0O, this) == ii0111o) {
/* 135 */                   return ii0111o;
                        }
                    } else {
/* 15 */                if (i != 1) {
/* 23 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                    return null;
                        }
/* 17 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 136 */           return OoiIlOl1iI.I00000oIO;
                }
            }
