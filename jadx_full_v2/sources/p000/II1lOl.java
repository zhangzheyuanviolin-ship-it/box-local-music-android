            package p000;

            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
/* 35 */    public final class II1lOl extends IlllollI implements Function1 {
                public final int I00ioIO;
                public final Object I00l0I0l0lO1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public II1lOl(O1oiOloOo o1oiOloOo, int i) {
/* 17 */            super(1, Iooooooil.class, "isWarm", "findVlm$isWarm(Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerUiState;Lcom/google/ai/edge/gallery/data/Model;)Z", 0);
/* 1 */             this.I00ioIO = i;
                    switch (i) {
                        case 1:
/* 22 */                    this.I00l0I0l0lO1 = o1oiOloOo;
/* 33 */                    super(1, Iooooooil.class, "isDownloaded", "findVlm$isDownloaded(Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerUiState;Lcom/google/ai/edge/gallery/data/Model;)Z", 0);
                            break;
                        default:
/* 6 */                     this.I00l0I0l0lO1 = o1oiOloOo;
                            break;
                    }
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00ioIO;
/* 6 */             Object obj2 = this.I00l0I0l0lO1;
                    switch (i) {
                        case 0:
/* 71 */                    O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) obj;
/* 73 */                    O1oiOloOo o1oiOloOo = (O1oiOloOo) obj2;
/* 75 */                    Map map = o1oiOloOo.I0000Il00O;
/* 77 */                    String str = o1oIOiI11o0.I00000oIO;
/* 83 */                    O1oIo0iI00 o1oIo0iI00 = (O1oIo0iI00) map.get(str);
/* 93 */                    if ((o1oIo0iI00 != null ? o1oIo0iI00.I00000oIO : null) == ModelDownloadStatusType.SUCCEEDED && o1oIOiI11o0.I00IlilI0i0i != null) {
/* 105 */                       O1oOil o1oOil = (O1oOil) o1oiOloOo.I0000O.get(str);
/* 113 */                       if ((o1oOil != null ? o1oOil.I00000oIO : null) == O1oOl0.I00iiO) {
/* 115 */                           z = true;
                                }
                            }
/* 116 */                   return Boolean.valueOf(z);
                        case 1:
/* 55 */                    O1oIo0iI00 o1oIo0iI002 = (O1oIo0iI00) ((O1oiOloOo) obj2).I0000Il00O.get(((O1oIOiI11o0) obj).I00000oIO);
/* 66 */                    return Boolean.valueOf((o1oIo0iI002 != null ? o1oIo0iI002.I00000oIO : null) == ModelDownloadStatusType.SUCCEEDED);
                        default:
/* 13 */                    float[] fArr = ((O1i010l1l) obj).I00000oIO;
/* 23 */                    O0iOOo0Ii o0iOOo0Ii = (O0iOOo0Ii) ((O0oIIIiiO1) obj2).I00oI0i.getValue();
/* 25 */                    if (o0iOOo0Ii != null) {
/* 31 */                        O0iOOo0Ii o0iOOo0Ii2 = o0iOOo0Ii.I0010o() ? o0iOOo0Ii : null;
/* 34 */                        if (o0iOOo0Ii2 != null) {
/* 37 */                            o0iOOo0Ii2.I000OOo1O(fArr);
                                }
                            }
/* 40 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 36 */        public II1lOl(O0oIIIiiO1 o0oIIIiiO1) {
                    super(1, Iooooooil.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                    this.I00ioIO = 2;
/* 37 */            this.I00l0I0l0lO1 = o0oIIIiiO1;
                }
            }
