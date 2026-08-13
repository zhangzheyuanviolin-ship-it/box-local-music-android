            package p000;

            import android.graphics.Bitmap;
            import com.google.ai.edge.gallery.common.CallJsSkillResult;
            import com.google.ai.edge.gallery.common.CallJsSkillResultImage;
            import com.google.ai.edge.gallery.common.CallJsSkillResultWebview;
            import com.google.ai.edge.gallery.customtasks.agentchat.AgentTools;
            import p000.OI011oo1;
            
            public final class Ol0ol1oOoilI extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public Object I00iiI;
                public final AgentTools I00iiO;
                public final Ol0ioI1iI I00iio;
                public final OI10i0Il I00ilI0I1;
                public final OI10i0Il I00ilO0;
                public final OI10i0Il I00io1l;
                public final OI10i0Il I00ioIO;
                public final OI10i0Il I00l0I0l0lO1;
                public final OI10i0Il I00l0OO0IO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ol0ol1oOoilI(AgentTools agentTools, Ol0ioI1iI ol0ioI1iI, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, OI10i0Il oI10i0Il3, OI10i0Il oI10i0Il4, OI10i0Il oI10i0Il5, OI10i0Il oI10i0Il6, IOoil1iiIilo iOoil1iiIilo) {
/* 18 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iiO = agentTools;
/* 3 */             this.I00iio = ol0ioI1iI;
/* 5 */             this.I00ilI0I1 = oI10i0Il;
/* 7 */             this.I00ilO0 = oI10i0Il2;
/* 9 */             this.I00io1l = oI10i0Il3;
/* 11 */            this.I00ioIO = oI10i0Il4;
/* 13 */            this.I00l0I0l0lO1 = oI10i0Il5;
/* 15 */            this.I00l0OO0IO = oI10i0Il6;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 20 */            Ol0ol1oOoilI ol0ol1oOoilI = new Ol0ol1oOoilI(this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, this.I00l0I0l0lO1, this.I00l0OO0IO, iOoil1iiIilo);
/* 23 */            ol0ol1oOoilI.I00iiI = obj;
/* 37 */            return ol0ol1oOoilI;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((Ol0ol1oOoilI) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Can't wrap try/catch for region: R(12:(1:60)|(1:(2:5|6)(2:11|12))(3:13|14|(4:16|48|54|55)(2:17|(1:19)))|20|58|21|25|(1:27)|28|(1:30)(9:31|(1:33)|34|(1:36)|37|(1:39)(1:40)|41|(1:45)|(1:47))|48|54|55) */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
                
                    r0 = p000.lIoii1l01l0i.I00000oIO(r0);
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objI0010o;
                    Bitmap bitmapI00000oIO;
/* 3 */             AgentTools agentTools = this.I00iiO;
/* 9 */             Ii0110 ii0110 = (Ii0110) this.I00iiI;
/* 11 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 13 */            int i = this.I00iOIl;
/* 15 */            OI10i0Il oI10i0Il = this.I00ioIO;
/* 17 */            OI10i0Il oI10i0Il2 = this.I00io1l;
/* 20 */            OI10i0Il oI10i0Il3 = this.I00l0OO0IO;
/* 22 */            OI10i0Il oI10i0Il4 = this.I00ilO0;
/* 24 */            OI10i0Il oI10i0Il5 = this.I00ilI0I1;
/* 26 */            String str = "";
                    try {
                        try {
                        } catch (Exception e) {
/* 247 */                   String message = e.getMessage();
/* 251 */                   if (message == null) {
/* 253 */                       message = "Unknown error";
                            }
/* 255 */                   oI10i0Il4.setValue(message);
                        }
/* 29 */                if (i == 0) {
/* 51 */                    lIoii1l01l0i.I00000oOI(obj);
/* 54 */                    oI10i0Il5.setValue("");
/* 57 */                    oI10i0Il4.setValue("");
/* 60 */                    oI10i0Il2.setValue(null);
/* 63 */                    oI10i0Il.setValue(null);
/* 76 */                    String strI000O01llI0 = agentTools.getSkillManagerViewModel().I000O01llI0(this.I00iio.I001i1O0Ol(), "");
/* 80 */                    if (strI000O01llI0 == null) {
/* 84 */                        oI10i0Il4.setValue("JS skill url not specified");
/* 259 */                       return OoiIlOl1iI.I00000oIO;
                            }
/* 101 */                   IIiI1II iIiI1II = new IIiI1II(12, strI000O01llI0, (String) this.I00l0I0l0lO1.getValue(), null);
/* 104 */                   agentTools.sendAgentAction(iIiI1II);
/* 107 */                   IOi10loi iOi10loi = iIiI1II.I0000O;
/* 109 */                   this.I00iiI = ii0110;
/* 112 */                   this.I00iOIl = 1;
/* 114 */                   objI0010o = iOi10loi.I0010o(this);
/* 118 */                   if (objI0010o == ii0111o) {
/* 120 */                       return ii0111o;
                            }
                        } else {
/* 31 */                    if (i != 1) {
/* 47 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 28 */                        return null;
                            }
/* 33 */                    lIoii1l01l0i.I00000oOI(obj);
/* 36 */                    objI0010o = obj;
                        }
/* 122 */               String str2 = (String) objI0010o;
/* 147 */               Object objI00000oIO = (CallJsSkillResult) new OI011oo1.I0000Il00O().build().adapter(CallJsSkillResult.class).failOnUnknown().fromJson(str2);
/* 157 */               if (objI00000oIO instanceof Oi10Ii1i1lo) {
/* 159 */                   objI00000oIO = null;
                        }
/* 160 */               CallJsSkillResult callJsSkillResult = (CallJsSkillResult) objI00000oIO;
/* 162 */               if (callJsSkillResult == null) {
/* 164 */                   oI10i0Il5.setValue(str2);
                        } else {
/* 168 */                   CallJsSkillResultImage image = callJsSkillResult.getImage();
/* 174 */                   String base64 = image != null ? image.getBase64() : null;
/* 178 */                   CallJsSkillResultWebview webview = callJsSkillResult.getWebview();
/* 182 */                   String result = callJsSkillResult.getResult();
/* 186 */                   if (result == null) {
/* 26 */                        result = "";
                            }
/* 189 */                   String error = callJsSkillResult.getError();
/* 193 */                   if (error != null) {
/* 196 */                       str = error;
                            }
/* 222 */                   oI10i0Il5.setValue("{\"result\": \"" + result + "\", \"error\": \"" + str + "\"}");
/* 225 */                   if (base64 != null && (bitmapI00000oIO = Ol0o1l0ll0i.I00000oIO(base64)) != null) {
/* 233 */                       oI10i0Il2.setValue(bitmapI00000oIO);
                            }
/* 236 */                   if (webview != null) {
/* 238 */                       oI10i0Il.setValue(webview);
                            }
                        }
/* 259 */               return OoiIlOl1iI.I00000oIO;
                    } finally {
/* 264 */               oI10i0Il3.setValue(Boolean.FALSE);
                    }
                }
            }
