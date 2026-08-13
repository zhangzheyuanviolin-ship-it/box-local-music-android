            package p000;

            import android.view.View;
            import android.view.ViewParent;
            import com.box.gallery.R;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.ai.edge.gallery.ui.common.SavedSystemPrompt;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class IO1I11OO implements Function1 {
                public final int I00iOIl;

                public IO1I11OO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final Object invoke(Object obj) throws Exception {
/* 5 */             int i = this.I00iOIl;
/* 26 */            Object[] objArr = 0;
/* 26 */            Object[] objArr2 = 0;
/* 28 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 663 */                   return Integer.valueOf(((IoIolIO1) obj).I00000oIO.length());
                        case 1:
/* 649 */                   return ((Conversation) obj).getId();
                        case 2:
/* 642 */                   ((Oi11lOiIoi) obj).I0000Il00O(0.8f);
/* 645 */                   return ooiIlOl1iI;
                        case 3:
/* 635 */                   return ooiIlOl1iI;
                        case 4:
/* 622 */                   OO010O1i1001 oO010O1i1001 = (OO010O1i1001) ((OoIOloiIii) obj);
/* 624 */                   oO010O1i1001.I00o0l1o1o0 = false;
/* 626 */                   lO1OiIiIo0oi.I00000oOI(oO010O1i1001);
/* 629 */                   return Boolean.FALSE;
                        case 5:
/* 615 */                   Oil0Io.I000OiO((Oil0O0I) obj, 1);
/* 618 */                   return ooiIlOl1iI;
                        case 6:
/* 608 */                   Oil0Io.I000OiO((Oil0O0I) obj, 0);
/* 611 */                   return ooiIlOl1iI;
                        case 7:
/* 601 */                   ((Long) obj).getClass();
/* 604 */                   return ooiIlOl1iI;
                        case 8:
/* 565 */                   IOl0oi0lOl1 iOl0oi0lOl1 = (IOl0oi0lOl1) obj;
/* 572 */                   O0iiOioolIi o0iiOioolIi = iOl0oi0lOl1 instanceof O0iiOioolIi ? (O0iiOioolIi) iOl0oi0lOl1 : null;
/* 574 */                   if (o0iiOioolIi != null && o0iiOioolIi.I010o0o0oO) {
/* 594 */                       IolioOO1.I0000Il00O("Apply is called on deactivated node " + iOl0oi0lOl1);
                            }
/* 597 */                   return ooiIlOl1iI;
                        case 9:
/* 559 */                   return Boolean.valueOf(!(((O1ooIoIolOli) obj) instanceof IOl11II));
                        case 10:
/* 524 */                   View view = ((OoollliO110) ((IOlIOlli0I) obj).I00iIO(IoI1OoO0.I00000oIO)).I00000oIO;
/* 526 */                   while (view != null) {
/* 531 */                       Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
/* 535 */                       if (tag != null) {
/* 537 */                           return tag;
                                }
/* 539 */                       ViewParent viewParentI00000oIO = li1l0O0Oil.I00000oIO(view);
/* 550 */                       view = viewParentI00000oIO instanceof View ? (View) viewParentI00000oIO : null;
                            }
/* 26 */                    return null;
                        case 11:
/* 510 */                   return (O11oOOio1iO) IOOi0Ool1i.I001lIiIIo1O((Iterable) ((IOlIOlli0I) obj).I00iIO(IOlO0o100i1i.I000oI1ioi));
                        case 12:
/* 492 */                   List list = IOll1OIIi0O1.I00000oIO;
/* 494 */                   return ooiIlOl1iI;
                        case 13:
/* 484 */                   return ((SavedSystemPrompt) obj).getId();
                        case 14:
/* 380 */                   OiIIl0O1l0l oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT * FROM conversations ORDER BY updatedAt DESC");
                            try {
/* 384 */                       int iI00000oIO = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "id");
/* 388 */                       int iI00000oIO2 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "title");
/* 392 */                       int iI00000oIO3 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "taskType");
/* 396 */                       int iI00000oIO4 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "modelName");
/* 400 */                       int iI00000oIO5 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "createdAt");
/* 404 */                       int iI00000oIO6 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "updatedAt");
/* 408 */                       int iI00000oIO7 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "messageCount");
/* 412 */                       int iI00000oIO8 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "systemPrompt");
/* 418 */                       ArrayList arrayList = new ArrayList();
/* 425 */                       while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 467 */                           arrayList.add(new Conversation(oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO), oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO2), oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO3), oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO4), oiIIl0O1l0lI00000oIO.getLong(iI00000oIO5), oiIIl0O1l0lI00000oIO.getLong(iI00000oIO6), (int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO7), oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO8)));
                                }
/* 476 */                       return arrayList;
                            } finally {
                            }
                        case 15:
/* 276 */                   OiIIl0O1l0l oiIIl0O1l0lI00000oIO2 = ((Olil0III) obj).I00000oIO("SELECT * FROM conversations ORDER BY updatedAt DESC");
                            try {
/* 280 */                       int iI00000oIO9 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO2, "id");
/* 284 */                       int iI00000oIO10 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO2, "title");
/* 288 */                       int iI00000oIO11 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO2, "taskType");
/* 292 */                       int iI00000oIO12 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO2, "modelName");
/* 296 */                       int iI00000oIO13 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO2, "createdAt");
/* 300 */                       int iI00000oIO14 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO2, "updatedAt");
/* 304 */                       int iI00000oIO15 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO2, "messageCount");
/* 308 */                       int iI00000oIO16 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO2, "systemPrompt");
/* 314 */                       ArrayList arrayList2 = new ArrayList();
/* 321 */                       while (oiIIl0O1l0lI00000oIO2.I00ol1()) {
/* 363 */                           arrayList2.add(new Conversation(oiIIl0O1l0lI00000oIO2.I00i0O(iI00000oIO9), oiIIl0O1l0lI00000oIO2.I00i0O(iI00000oIO10), oiIIl0O1l0lI00000oIO2.I00i0O(iI00000oIO11), oiIIl0O1l0lI00000oIO2.I00i0O(iI00000oIO12), oiIIl0O1l0lI00000oIO2.getLong(iI00000oIO13), oiIIl0O1l0lI00000oIO2.getLong(iI00000oIO14), (int) oiIIl0O1l0lI00000oIO2.getLong(iI00000oIO15), oiIIl0O1l0lI00000oIO2.I00i0O(iI00000oIO16)));
                                }
/* 372 */                       return arrayList2;
                            } finally {
                            }
                        case 16:
                            try {
/* 261 */                       ((Olil0III) obj).I00000oIO("DELETE FROM conversations").I00ol1();
/* 267 */                       return ooiIlOl1iI;
                            } finally {
                            }
                        case 17:
/* 252 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 206 */                   Map.Entry entry = (Map.Entry) obj;
/* 212 */                   String str = (String) entry.getKey();
/* 214 */                   Object value = entry.getValue();
/* 220 */                   StringBuilder sb = new StringBuilder();
/* 223 */                   sb.append(str);
/* 228 */                   sb.append(" : ");
/* 233 */                   if (value instanceof Object[]) {
/* 237 */                       value = Arrays.toString((Object[]) value);
                            }
/* 241 */                   sb.append(value);
/* 244 */                   return sb.toString();
                        case PoseLandmark.LEFT_INDEX:
/* 201 */                   Oil0Io.I000lI((Oil0O0I) obj);
/* 204 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_INDEX:
                            return obj instanceof Object[] ? I1IoiO1l.I001lllioOl((Object[]) obj, null, "[", "]", new IO1I11OO(20), 25) : String.valueOf(obj);
                        case PoseLandmark.LEFT_THUMB:
/* 165 */                   return ((O1oIOoi0oo) obj).I00000oOI;
                        case PoseLandmark.RIGHT_THUMB:
/* 159 */                   return ((O1oIOoi0oo) obj).I0000Il00O;
                        case PoseLandmark.LEFT_HIP:
/* 118 */                   List list2 = (List) obj;
/* 128 */                   int iIntValue = ((Integer) list2.get(0)).intValue();
/* 138 */                   float fFloatValue = ((Float) list2.get(1)).floatValue();
/* 144 */                   IiI01o1 iiI01o1 = new IiI01o1(0);
/* 147 */                   iiI01o1.I00iiI = list2;
/* 149 */                   VarHandle.storeStoreFence();
/* 152 */                   return new IiI0O1Io(iIntValue, fFloatValue, iiI01o1);
                        case PoseLandmark.RIGHT_HIP:
/* 101 */                   IoIiIIll ioIiIIll = (IoIiIIll) obj;
/* 103 */                   ioIiIIll.I0000Il00O = false;
/* 113 */                   ioIiIIll.I00000oIO.add(new Ii1O0l(2, objArr == true ? 1 : 0));
/* 116 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_KNEE:
/* 95 */                    return Boolean.valueOf(iIIloIilo.I00000oIO(obj));
                        case PoseLandmark.RIGHT_KNEE:
/* 87 */                    ((IOIooi0ol1i) obj).I00000oIO.I00io1l.I000II(IoO0l0Iiioll.I000II, new I0i11IIlO(3, objArr2 == true ? 1 : 0));
/* 90 */                    return ooiIlOl1iI;
                        case 27:
/* 68 */                    ((O1I1OOiol) IiioIIllI.I0000Il00O.getValue()).I000l1("The SaveBodyPlugin plugin is deprecated and can be safely removed. Request bodies are now saved in memory by default for all non-streaming responses.");
/* 71 */                    return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_ANKLE:
/* 47 */                    Oil0Io.I0000O((Oil0O0I) obj, "Resume download");
/* 50 */                    return ooiIlOl1iI;
                        default:
/* 38 */                    Oil0Io.I0000O((Oil0O0I) obj, "Pause download");
/* 41 */                    return ooiIlOl1iI;
                    }
                }
            }
