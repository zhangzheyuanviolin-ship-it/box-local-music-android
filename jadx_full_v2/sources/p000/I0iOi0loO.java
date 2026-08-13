            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            import android.provider.CalendarContract;
            import android.util.Log;
            import com.google.ai.edge.gallery.customtasks.agentchat.AgentTools;
            import com.google.ai.edge.gallery.customtasks.agentchat.CreateCalendarEventParams;
            import com.google.ai.edge.gallery.customtasks.agentchat.ScheduleNotificationParams;
            import com.google.ai.edge.gallery.customtasks.agentchat.SendEmailParams;
            import com.google.ai.edge.gallery.customtasks.agentchat.SendSmsParams;
            import java.text.SimpleDateFormat;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.UUID;
            import p000.OI011oo1;
            
/* 13 */    public final class I0iOi0loO extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 0;
                public int I00iiI;
                public String I00iiO;
                public final AgentTools I00iio;
                public final String I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0iOi0loO(String str, AgentTools agentTools, String str2, IOoil1iiIilo iOoil1iiIilo) {
/* 11 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00iiO = str;
/* 6 */             this.I00iio = agentTools;
/* 8 */             this.I00ilI0I1 = str2;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             String str = this.I00ilI0I1;
/* 5 */             AgentTools agentTools = this.I00iio;
                    switch (i) {
                        case 0:
/* 20 */                    return new I0iOi0loO(agentTools, str, iOoil1iiIilo);
                        default:
/* 14 */                    return new I0iOi0loO(this.I00iiO, agentTools, str, iOoil1iiIilo);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((I0iOi0loO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:122:0x04d5, code lost:
                
                    if (r3.I00000oOI(r19, r9) == r1) goto L127;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:124:0x04d8, code lost:
                
                    r0 = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:126:0x04f7, code lost:
                
                    if (r3.I00000oOI(r19, r7) == r1) goto L127;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:148:?, code lost:
                
                    return r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:98:0x0417, code lost:
                
                    if (r0 != r12) goto L100;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    String string;
                    String str;
                    Object objI00000oIO;
                    ScheduleNotificationParams scheduleNotificationParams;
                    Object value;
/* 3 */             int i = this.I00iOIl;
/* 7 */             AgentTools agentTools = this.I00iio;
/* 9 */             String str2 = this.I00ilI0I1;
/* 15 */            Object obj2 = null;
                    switch (i) {
                        case 0:
/* 1084 */                  Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 1086 */                  int i2 = this.I00iiI;
/* 1088 */                  if (i2 == 0) {
/* 1108 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1119 */                      Iterator it = agentTools.getSkillManagerViewModel().I000OiO().iterator();
                                while (true) {
/* 1127 */                          if (it.hasNext()) {
/* 1129 */                              Object next = it.next();
/* 1152 */                              if (O0000Ioio00.I0000O(((Ol0ioI1iI) next).I001i1O0Ol(), OlOoOIi0o.I00OIo(str2).toString())) {
/* 1154 */                                  obj2 = next;
                                        }
                                    }
                                }
/* 1156 */                      Ol0ioI1iI ol0ioI1iI = (Ol0ioI1iI) obj2;
/* 1158 */                      if (ol0ioI1iI != null) {
/* 1160 */                          String strI001i1O0Ol = ol0ioI1iI.I001i1O0Ol();
/* 1164 */                          String strI0010o = ol0ioI1iI.I0010o();
/* 1168 */                          String strI001IO000 = ol0ioI1iI.I001IO000();
/* 1178 */                          StringBuilder sbI00111O = IIl001iO0Io.I00111O("---\nname: ", strI001i1O0Ol, "\ndescription: ", strI0010o, "\n---\n\n");
/* 1182 */                          sbI00111O.append(strI001IO000);
/* 1185 */                          string = sbI00111O.toString();
                                } else {
/* 1190 */                          string = "Skill not found";
                                }
/* 1192 */                      if (ol0ioI1iI == null) {
/* 1 */                             IO1010 io1010 = agentTools._actionChannel;
/* 1260 */                          Ol0oI0 ol0oI0 = new Ol0oI0(IlIi0I0.I000lI("Failed to load skill \"", str2, "\""), (String) null, 28, false, (String) null);
/* 1263 */                          this.I00iiO = string;
/* 1266 */                          this.I00iiI = 2;
                                    break;
                                } else {
/* 1 */                             IO1010 io10102 = agentTools._actionChannel;
/* 1227 */                          Ol0oI0 ol0oI02 = new Ol0oI0(IlIi0I0.I000lI("Loading skill \"", str2, "\""), true, IlIi0I0.I000lI("Load \"", ol0ioI1iI.I001i1O0Ol(), "\""), IIl001iO0Io.I000o00OoI0I("Description: ", ol0ioI1iI.I0010o()), ol0ioI1iI);
/* 1230 */                          this.I00iiO = string;
/* 1232 */                          this.I00iiI = 1;
                                    break;
                                }
                            } else {
/* 1090 */                      if (i2 != 1 && i2 != 2) {
/* 1096 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 15 */                            return null;
                                }
/* 1101 */                      str = this.I00iiO;
/* 1103 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1294 */                  return O1Oii0O0loo.I0000O(new OIoi0IIoi("skill_name", str2), new OIoi0IIoi("skill_instructions", str));
                        default:
/* 25 */                    String str3 = this.I00iiO;
/* 27 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 29 */                    int i3 = this.I00iiI;
/* 31 */                    if (i3 == 0) {
/* 53 */                        lIoii1l01l0i.I00000oOI(obj);
/* 58 */                        IooOolool1lI.I00iiI.getClass();
/* 65 */                        if (liIoOiiO1Oi.I000II(str3) == null) {
/* 88 */                            Log.w("AGAgentTools", "Intent not found: '" + str3 + "'");
/* 1 */                             return agentTools.guardMissingEntityWithSkillFallback(str3, "Intent");
                                }
/* 1 */                         IO1010 io10103 = agentTools._actionChannel;
/* 127 */                       Ol0oI0 ol0oI03 = new Ol0oI0(IlIi0I0.I000lI("Executing intent \"", str3, "\""), IlIi0I0.I000lI("Execute intent \"", str3, "\""), 16, true, "Parameters: ".concat(str2));
/* 130 */                       this.I00iiI = 1;
/* 136 */                       if (io10103.I00000oOI(this, ol0oI03) != ii0111o2) {
                                }
/* 1050 */                      return ii0111o2;
                            }
/* 33 */                    if (i3 != 1) {
/* 35 */                        if (i3 != 2) {
/* 44 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 15 */                            return null;
                                }
/* 37 */                        lIoii1l01l0i.I00000oOI(obj);
/* 40 */                        objI00000oIO = obj;
/* 1079 */                      return O1Oii0O0loo.I0000O(new OIoi0IIoi("action", str3), new OIoi0IIoi("parameters", str2), new OIoi0IIoi("result", (String) objI00000oIO));
                            }
/* 49 */                    lIoii1l01l0i.I00000oOI(obj);
/* 140 */                   Context context = agentTools.getContext();
/* 147 */                   I00oIiI10 i00oIiI10 = new I00oIiI10(agentTools, null, 3);
/* 150 */                   this.I00iiI = 2;
/* 156 */                   IooOolool1lI.I00iiI.getClass();
/* 159 */                   IooOolool1lI iooOolool1lII000II = liIoOiiO1Oi.I000II(str3);
/* 175 */                   String str4 = "succeeded";
/* 179 */                   String str5 = "failed";
                            switch (iooOolool1lII000II == null ? -1 : Iooi001.I00000oIO[iooOolool1lII000II.ordinal()]) {
                                case -1:
/* 179 */                           objI00000oIO = "failed";
                                    break;
                                case 0:
                                default:
/* 184 */                           I000II.I00000oIO();
/* 15 */                            return null;
                                case 1:
                                    try {
/* 961 */                               SendEmailParams sendEmailParams = (SendEmailParams) new OI011oo1.I0000Il00O().build().adapter(SendEmailParams.class).fromJson(str2);
/* 963 */                               if (sendEmailParams != null) {
/* 969 */                                   Intent intent = new Intent("android.intent.action.SEND");
/* 978 */                                   intent.setData(Uri.parse("mailto:"));
/* 983 */                                   intent.setType("text/plain");
/* 996 */                                   intent.putExtra("android.intent.extra.EMAIL", new String[]{sendEmailParams.getExtra_email()});
/* 1005 */                                  intent.putExtra("android.intent.extra.SUBJECT", sendEmailParams.getExtra_subject());
/* 1014 */                                  intent.putExtra("android.intent.extra.TEXT", sendEmailParams.getExtra_text());
/* 1017 */                                  context.startActivity(intent);
                                        } else {
/* 1028 */                                  Log.e("IntentHandler", "Failed to parse send_email parameters: ".concat(str2));
/* 179 */                                   str4 = "failed";
                                        }
/* 845 */                               str5 = str4;
                                    } catch (Exception e) {
/* 1039 */                              Log.e("IntentHandler", "Failed to parse send_email parameters: ".concat(str2), e);
                                    }
/* 855 */                           str4 = str5;
/* 1044 */                          objI00000oIO = str4;
                                    break;
                                case 2:
                                    try {
/* 878 */                               SendSmsParams sendSmsParams = (SendSmsParams) new OI011oo1.I0000Il00O().build().adapter(SendSmsParams.class).fromJson(str2);
/* 880 */                               if (sendSmsParams != null) {
/* 906 */                                   Intent intent2 = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sendSmsParams.getPhone_number()));
/* 915 */                                   intent2.putExtra("sms_body", sendSmsParams.getSms_body());
/* 918 */                                   context.startActivity(intent2);
                                        } else {
/* 928 */                                   Log.e("IntentHandler", "Failed to parse send_sms parameters: ".concat(str2));
/* 179 */                                   str4 = "failed";
                                        }
/* 845 */                               str5 = str4;
                                    } catch (Exception e2) {
/* 938 */                               Log.e("IntentHandler", "Failed to parse send_sms parameters: ".concat(str2), e2);
                                    }
/* 855 */                           str4 = str5;
/* 1044 */                          objI00000oIO = str4;
                                    break;
                                case 3:
                                    try {
/* 743 */                               CreateCalendarEventParams createCalendarEventParams = (CreateCalendarEventParams) new OI011oo1.I0000Il00O().build().adapter(CreateCalendarEventParams.class).fromJson(str2);
/* 745 */                               if (createCalendarEventParams != null) {
/* 755 */                                   SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
/* 762 */                                   Date date = simpleDateFormat.parse(createCalendarEventParams.getBegin_time());
/* 777 */                                   long time = date != null ? date.getTime() : 0L;
/* 782 */                                   Date date2 = simpleDateFormat.parse(createCalendarEventParams.getEnd_time());
/* 788 */                                   long time2 = date2 != null ? date2.getTime() : 0L;
/* 796 */                                   Intent intent3 = new Intent("android.intent.action.INSERT");
/* 801 */                                   intent3.setData(CalendarContract.Events.CONTENT_URI);
/* 810 */                                   intent3.putExtra("title", createCalendarEventParams.getTitle());
/* 819 */                                   intent3.putExtra("description", createCalendarEventParams.getDescription());
/* 824 */                                   intent3.putExtra("beginTime", time);
/* 829 */                                   intent3.putExtra("endTime", time2);
/* 832 */                                   context.startActivity(intent3);
                                        } else {
/* 840 */                                   Log.e("IntentHandler", "Failed to parse create_calendar_event parameters: ".concat(str2));
/* 179 */                                   str4 = "failed";
                                        }
/* 845 */                               str5 = str4;
                                    } catch (Exception e3) {
/* 852 */                               Log.e("IntentHandler", "Failed to parse create_calendar_event parameters: ".concat(str2), e3);
                                    }
/* 855 */                           str4 = str5;
/* 1044 */                          objI00000oIO = str4;
                                    break;
                                case 4:
/* 718 */                           objI00000oIO = IooiI1o0.I00000oIO.I00000oIO(context, str2, i00oIiI10, this);
                                    break;
                                case 5:
/* 710 */                           objI00000oIO = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss EEEE", Locale.getDefault()).format(new Date());
                                    break;
                                case 6:
                                    try {
/* 214 */                               scheduleNotificationParams = (ScheduleNotificationParams) new OI011oo1.I0000Il00O().build().adapter(ScheduleNotificationParams.class).fromJson(str2);
                                    } catch (Exception e4) {
/* 689 */                               Log.e("IntentHandler", "Failed to parse schedule_notification parameters: ".concat(str2), e4);
                                    }
/* 216 */                           if (scheduleNotificationParams != null) {
/* 218 */                               OiO1ll11l oiO1ll11lI00IO1oi11O = OiO1o1il0.I00IO1oi11O();
/* 226 */                               String string2 = UUID.randomUUID().toString();
/* 230 */                               oiO1ll11lI00IO1oi11O.I0000O();
/* 237 */                               ((OiO1o1il0) oiO1ll11lI00IO1oi11O.I00iiI).I00IoIO0lI(string2);
/* 240 */                               String title = scheduleNotificationParams.getTitle();
/* 244 */                               oiO1ll11lI00IO1oi11O.I0000O();
/* 251 */                               ((OiO1o1il0) oiO1ll11lI00IO1oi11O.I00iiI).I00O0o1oo(title);
/* 254 */                               String message = scheduleNotificationParams.getMessage();
/* 258 */                               oiO1ll11lI00IO1oi11O.I0000O();
/* 265 */                               ((OiO1o1il0) oiO1ll11lI00IO1oi11O.I00iiI).I00IoO0(message);
/* 268 */                               int hour = scheduleNotificationParams.getHour();
/* 272 */                               oiO1ll11lI00IO1oi11O.I0000O();
/* 279 */                               ((OiO1o1il0) oiO1ll11lI00IO1oi11O.I00iiI).I00Io1o110i(hour);
/* 282 */                               int minute = scheduleNotificationParams.getMinute();
/* 286 */                               oiO1ll11lI00IO1oi11O.I0000O();
/* 293 */                               ((OiO1o1il0) oiO1ll11lI00IO1oi11O.I00iiI).I00IoiI(minute);
/* 296 */                               oiO1ll11lI00IO1oi11O.I0000O();
/* 303 */                               ((OiO1o1il0) oiO1ll11lI00IO1oi11O.I00iiI).I00IOO();
/* 306 */                               oiO1ll11lI00IO1oi11O.I0000O();
/* 313 */                               ((OiO1o1il0) oiO1ll11lI00IO1oi11O.I00iiI).I00IioO0OiOi();
/* 320 */                               if (scheduleNotificationParams.getDeeplink() != null) {
/* 322 */                                   String deeplink = scheduleNotificationParams.getDeeplink();
/* 326 */                                   oiO1ll11lI00IO1oi11O.I0000O();
/* 333 */                                   ((OiO1o1il0) oiO1ll11lI00IO1oi11O.I00iiI).I00Io1lO(deeplink);
                                        } else if (scheduleNotificationParams.getTask_id() != null && scheduleNotificationParams.getModel_name() != null) {
/* 403 */                                   String string3 = Uri.parse("com.box.gallery://model/" + scheduleNotificationParams.getTask_id() + "/" + scheduleNotificationParams.getModel_name()).buildUpon().appendQueryParameter("query", scheduleNotificationParams.getMessage()).build().toString();
/* 407 */                                   oiO1ll11lI00IO1oi11O.I0000O();
/* 414 */                                   ((OiO1o1il0) oiO1ll11lI00IO1oi11O.I00iiI).I00Io1lO(string3);
                                        } else if (scheduleNotificationParams.getTask_id() != null) {
/* 463 */                                   String string4 = Uri.parse("com.box.gallery://" + scheduleNotificationParams.getTask_id() + "/").buildUpon().appendQueryParameter("query", scheduleNotificationParams.getMessage()).build().toString();
/* 467 */                                   oiO1ll11lI00IO1oi11O.I0000O();
/* 474 */                                   ((OiO1o1il0) oiO1ll11lI00IO1oi11O.I00iiI).I00Io1lO(string4);
                                        } else {
/* 500 */                                   String string5 = Uri.parse("com.box.gallery://llm_agent_chat/").buildUpon().appendQueryParameter("query", scheduleNotificationParams.getMessage()).build().toString();
/* 504 */                                   oiO1ll11lI00IO1oi11O.I0000O();
/* 511 */                                   ((OiO1o1il0) oiO1ll11lI00IO1oi11O.I00iiI).I00Io1lO(string5);
                                        }
/* 518 */                               if (scheduleNotificationParams.getYear() != null) {
/* 524 */                                   int iIntValue = scheduleNotificationParams.getYear().intValue();
/* 528 */                                   oiO1ll11lI00IO1oi11O.I0000O();
/* 535 */                                   ((OiO1o1il0) oiO1ll11lI00IO1oi11O.I00iiI).I00O10llo(iIntValue);
                                        }
/* 542 */                               if (scheduleNotificationParams.getMonth() != null) {
/* 548 */                                   int iIntValue2 = scheduleNotificationParams.getMonth().intValue();
/* 552 */                                   oiO1ll11lI00IO1oi11O.I0000O();
/* 559 */                                   ((OiO1o1il0) oiO1ll11lI00IO1oi11O.I00iiI).I00Iooi00oi(iIntValue2);
                                        }
/* 566 */                               if (scheduleNotificationParams.getDay() != null) {
/* 572 */                                   int iIntValue3 = scheduleNotificationParams.getDay().intValue();
/* 576 */                                   oiO1ll11lI00IO1oi11O.I0000O();
/* 583 */                                   ((OiO1o1il0) oiO1ll11lI00IO1oi11O.I00iiI).I00IlilI0i0i(iIntValue3);
                                        }
/* 590 */                               if (scheduleNotificationParams.getRepeat_daily() != null) {
/* 596 */                                   boolean zBooleanValue = scheduleNotificationParams.getRepeat_daily().booleanValue();
/* 600 */                                   oiO1ll11lI00IO1oi11O.I0000O();
/* 607 */                                   ((OiO1o1il0) oiO1ll11lI00IO1oi11O.I00iiI).I00O0i0ii(zBooleanValue);
                                        }
/* 630 */                               OIOI0I oioi0i = (OIOI0I) ((Ii110ilOil) ((OIOI0lo) ilII1li.I00000oIO(context.getApplicationContext(), OIOI0lo.class))).I000o00OoI0I.get();
/* 636 */                               OiO1o1il0 oiO1o1il0 = (OiO1o1il0) oiO1ll11lI00IO1oi11O.I00000oOI();
/* 638 */                               oioi0i.I00000oOI(oiO1o1il0);
/* 641 */                               OlO0OIIl1 olO0OIIl1 = oioi0i.I0000oI00;
/* 660 */                               do {
/* 643 */                                   value = olO0OIIl1.getValue();
/* 660 */                               } while (!olO0OIIl1.I000iOII(value, IOOi0Ool1i.I00OI1((List) value, oiO1o1il0)));
/* 671 */                               iOi1II01i0.I0000O(oioi0i.I0000O, null, null, new O1iOlO(oioi0i, (IOoil1iiIilo) null, 2), 3);
/* 1044 */                              objI00000oIO = str4;
                                        break;
                                    } else {
/* 680 */                               Log.e("IntentHandler", "Failed to parse schedule_notification parameters: ".concat(str2));
/* 855 */                               str4 = str5;
/* 1044 */                              objI00000oIO = str4;
                                    }
                                    break;
                            }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public I0iOi0loO(AgentTools agentTools, String str, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 15 */            this.I00iio = agentTools;
                    this.I00ilI0I1 = str;
                }
            }
