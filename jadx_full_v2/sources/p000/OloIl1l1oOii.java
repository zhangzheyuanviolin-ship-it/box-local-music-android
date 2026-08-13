            package p000;

            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class OloIl1l1oOii {
                public final String I00000oIO;
                public final String I00000oOI;
                public final IO0l1oIIi1i I0000Il00O;
                public final IoiOolO1iOo I0000O;
                public final Integer I0000oI00;
                public final String I0001Ioi1lo;
                public final String I000II;
                public final String I000O01llI0;
                public final String I000OOo1O;
                public final ArrayList I000OiO;
                public final List I000iOII;
                public final boolean I000l1;
                public final boolean I000lI;
                public final boolean I000o00OoI0I;
                public final String I000oI1ioi;
                public final int I00100l0;
                public final int I00100o1O0lo;
                public int I0010I0i;
                public final OI10i0Il I0010o;

                public OloIl1l1oOii(String str, String str2, IO0l1oIIi1i iO0l1oIIi1i, IoiOolO1iOo ioiOolO1iOo, Integer num, String str3, String str4, String str5, ArrayList arrayList, int i) {
/* 10 */            IoiOolO1iOo ioiOolO1iOo2 = (i & 8) != 0 ? null : ioiOolO1iOo;
/* 14 */            Integer num2 = (i & 16) == 0 ? num : null;
/* 27 */            String str6 = (i & Barcode.FORMAT_ITF) != 0 ? "" : "https://github.com/google-ai-edge/LiteRT-LM/blob/main/kotlin/README.md";
/* 35 */            String str7 = (i & Barcode.FORMAT_QR_CODE) != 0 ? "" : str5;
/* 45 */            boolean z = (i & 8192) == 0;
/* 48 */            boolean z2 = (i & 16384) == 0;
/* 58 */            String str8 = (32768 & i) == 0 ? "You are an AI assistant that helps users by answering questions and completes tasks using skills. For EVERY new task or request or question, you MUST execute the following steps in exact order. You MUST NOT skip any steps.\n\nCRITICAL RULE: You MUST execute all steps silently. Do NOT generate or output any internal thoughts, reasoning, explanations, or intermediate text at ANY step.\n\n1. First, find the most relevant skill from the following list:\n\n___SKILLS___\n\nAfter this step you MUST go to next step. You MUST NOT use `run_intent` under any circumstances at this step.\n\n2. If a relevant skill exists, use the `load_skill` tool to read its instructions. You MUST NOT use `run_intent` under any circumstances at this step.\n\n3. Follow the skill's instructions exactly to complete the task. You MUST NOT output any intermediate thoughts or status updates. No exceptions! Output ONLY the final result when successful. It should contain one-sentence summary of the action taken, and the final result of the skill." : "";
/* 69 */            int i2 = (65536 & i) != 0 ? R.string.chat_generic_agent_name : R.string.chat_agent_agent_name;
/* 81 */            int i3 = (i & 131072) != 0 ? R.string.chat_textinput_placeholder : R.string.text_input_placeholder_llm_chat;
/* 88 */            OIool0l11 oIool0l11 = new OIool0l11(0L);
/* 94 */            this.I00000oIO = str;
/* 96 */            this.I00000oOI = str2;
/* 100 */           this.I0000Il00O = iO0l1oIIi1i;
/* 102 */           this.I0000O = ioiOolO1iOo2;
/* 104 */           this.I0000oI00 = num2;
/* 108 */           this.I0001Ioi1lo = str3;
/* 112 */           this.I000II = str4;
/* 114 */           this.I000O01llI0 = str6;
/* 116 */           this.I000OOo1O = str7;
/* 120 */           this.I000OiO = arrayList;
/* 124 */           this.I000iOII = Il01100l.I00iOIl;
/* 126 */           this.I000l1 = false;
/* 128 */           this.I000lI = z;
/* 130 */           this.I000o00OoI0I = z2;
/* 132 */           this.I000oI1ioi = str8;
/* 134 */           this.I00100l0 = i2;
/* 136 */           this.I00100o1O0lo = i3;
/* 139 */           this.I0010I0i = -1;
/* 141 */           this.I0010o = oIool0l11;
                }

                public final boolean I00000oIO() {
/* 3 */             String str = this.I00000oIO;
                    return O0000Ioio00.I0000O(str, "llm_chat") || O0000Ioio00.I0000O(str, "llm_ask_image") || O0000Ioio00.I0000O(str, "llm_ask_audio");
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 207 */               return true;
                    }
/* 7 */             if (!(obj instanceof OloIl1l1oOii)) {
/* 205 */               return false;
                    }
/* 11 */            OloIl1l1oOii oloIl1l1oOii = (OloIl1l1oOii) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oloIl1l1oOii.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oloIl1l1oOii.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oloIl1l1oOii.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oloIl1l1oOii.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, oloIl1l1oOii.I0000oI00) && O0000Ioio00.I0000O(this.I0001Ioi1lo, oloIl1l1oOii.I0001Ioi1lo) && O0000Ioio00.I0000O(this.I000II, oloIl1l1oOii.I000II) && O0000Ioio00.I0000O(this.I000O01llI0, oloIl1l1oOii.I000O01llI0) && O0000Ioio00.I0000O(this.I000OOo1O, oloIl1l1oOii.I000OOo1O) && O0000Ioio00.I0000O(this.I000OiO, oloIl1l1oOii.I000OiO) && O0000Ioio00.I0000O(this.I000iOII, oloIl1l1oOii.I000iOII) && this.I000l1 == oloIl1l1oOii.I000l1 && this.I000lI == oloIl1l1oOii.I000lI && this.I000o00OoI0I == oloIl1l1oOii.I000o00OoI0I && O0000Ioio00.I0000O(this.I000oI1ioi, oloIl1l1oOii.I000oI1ioi) && this.I00100l0 == oloIl1l1oOii.I00100l0 && this.I00100o1O0lo == oloIl1l1oOii.I00100o1O0lo && this.I0010I0i == oloIl1l1oOii.I0010I0i && O0000Ioio00.I0000O(this.I0010o, oloIl1l1oOii.I0010o);
                }

                public final int hashCode() {
/* 23 */            int iHashCode = (this.I0000Il00O.hashCode() + Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI)) * 31;
/* 25 */            IoiOolO1iOo ioiOolO1iOo = this.I0000O;
/* 36 */            int iHashCode2 = (iHashCode + (ioiOolO1iOo == null ? 0 : ioiOolO1iOo.hashCode())) * 31;
/* 37 */            Integer num = this.I0000oI00;
/* 139 */           return this.I0010o.hashCode() + IIl001iO0Io.I0000O(this.I0010I0i, IIl001iO0Io.I0000O(this.I00100o1O0lo, IIl001iO0Io.I0000O(this.I00100l0, Oi010OO0.I000O01llI0(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(IIl001iO0Io.I0000oI00((this.I000OiO.hashCode() + Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.I0001Ioi1lo), 31, this.I000II), 31, this.I000O01llI0), 31, this.I000OOo1O)) * 31, 31, this.I000iOII), 31, false), 31, this.I000l1), 31, this.I000lI), 31, this.I000o00OoI0I), 31, this.I000oI1ioi), 31), 31), 31);
                }

                public final String toString() {
/* 1 */             int i = this.I0010I0i;
/* 13 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("Task(id=", this.I00000oIO, ", label=", this.I00000oOI, ", category=");
/* 19 */            sbI00111O.append(this.I0000Il00O);
/* 24 */            sbI00111O.append(", icon=");
/* 29 */            sbI00111O.append(this.I0000O);
/* 34 */            sbI00111O.append(", iconVectorResourceId=");
/* 39 */            sbI00111O.append(this.I0000oI00);
/* 44 */            sbI00111O.append(", description=");
/* 49 */            sbI00111O.append(this.I0001Ioi1lo);
/* 54 */            sbI00111O.append(", shortDescription=");
/* 65 */            IIl001iO0Io.I001lIiIIo1O(sbI00111O, this.I000II, ", docUrl=", this.I000O01llI0, ", sourceCodeUrl=");
/* 70 */            sbI00111O.append(this.I000OOo1O);
/* 75 */            sbI00111O.append(", models=");
/* 80 */            sbI00111O.append(this.I000OiO);
/* 85 */            sbI00111O.append(", modelNames=");
/* 90 */            sbI00111O.append(this.I000iOII);
/* 95 */            sbI00111O.append(", handleModelConfigChangesInTask=false, experimental=");
/* 100 */           sbI00111O.append(this.I000l1);
/* 105 */           sbI00111O.append(", newFeature=");
/* 110 */           sbI00111O.append(this.I000lI);
/* 115 */           sbI00111O.append(", useThemeColor=");
/* 120 */           sbI00111O.append(this.I000o00OoI0I);
/* 125 */           sbI00111O.append(", defaultSystemPrompt=");
/* 130 */           sbI00111O.append(this.I000oI1ioi);
/* 135 */           sbI00111O.append(", agentNameRes=");
/* 140 */           sbI00111O.append(this.I00100l0);
/* 145 */           sbI00111O.append(", textInputPlaceHolderRes=");
/* 150 */           sbI00111O.append(this.I00100o1O0lo);
/* 155 */           sbI00111O.append(", index=");
/* 158 */           sbI00111O.append(i);
/* 163 */           sbI00111O.append(", updateTrigger=");
/* 168 */           sbI00111O.append(this.I0010o);
/* 173 */           sbI00111O.append(")");
/* 176 */           return sbI00111O.toString();
                }
            }
