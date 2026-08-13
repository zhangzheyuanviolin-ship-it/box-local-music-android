            package p000;

            import android.content.ContentUris;
            import android.content.Context;
            import android.database.Cursor;
            import android.net.Uri;
            import android.provider.CalendarContract;
            import android.util.Log;
            import com.google.ai.edge.gallery.customtasks.agentchat.CalendarEventDto;
            import com.google.ai.edge.gallery.customtasks.agentchat.ReadCalendarEventsParams;
            import com.google.ai.edge.gallery.customtasks.agentchat.ReadCalendarEventsResponse;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Calendar;
            import java.util.Date;
            import java.util.Locale;
            import p000.OI011oo1;
            
            public final class IooiI1o0 {
                public static final IooiI1o0 I00000oIO = new IooiI1o0();

                /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[Catch: Exception -> 0x0189, TRY_ENTER, TryCatch #0 {Exception -> 0x0189, blocks: (B:24:0x0076, B:27:0x008f, B:29:0x00a4, B:61:0x0185, B:69:0x0191, B:67:0x018d, B:68:0x0190, B:71:0x01a1, B:73:0x01b5, B:31:0x00fd, B:32:0x0118, B:36:0x0122, B:42:0x0130, B:46:0x0139, B:50:0x0146, B:52:0x0156, B:54:0x015c, B:58:0x016f, B:59:0x0178, B:65:0x018b), top: B:77:0x0076, inners: #1, #2 }] */
                /* JADX WARN: Removed duplicated region for block: B:73:0x01b5 A[Catch: Exception -> 0x0189, TRY_LEAVE, TryCatch #0 {Exception -> 0x0189, blocks: (B:24:0x0076, B:27:0x008f, B:29:0x00a4, B:61:0x0185, B:69:0x0191, B:67:0x018d, B:68:0x0190, B:71:0x01a1, B:73:0x01b5, B:31:0x00fd, B:32:0x0118, B:36:0x0122, B:42:0x0130, B:46:0x0139, B:50:0x0146, B:52:0x0156, B:54:0x015c, B:58:0x016f, B:59:0x0178, B:65:0x018b), top: B:77:0x0076, inners: #1, #2 }] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(Context context, String str, I00oIiI10 i00oIiI10, IOoilo iOoilo) throws Throwable {
                    Iooi1I00IlO iooi1I00IlO;
                    String str2;
                    ReadCalendarEventsParams readCalendarEventsParams;
                    String string;
                    String string2;
                    int i;
                    int i2;
                    long j;
                    int i3;
                    String str3;
/* 1 */             Context context2 = context;
/* 19 */            if (iOoilo instanceof Iooi1I00IlO) {
/* 22 */                iooi1I00IlO = (Iooi1I00IlO) iOoilo;
/* 24 */                int i4 = iooi1I00IlO.I00ilI0I1;
/* 30 */                if ((i4 & Integer.MIN_VALUE) != 0) {
/* 33 */                    iooi1I00IlO.I00ilI0I1 = i4 - Integer.MIN_VALUE;
                        } else {
/* 40 */                    iooi1I00IlO = new Iooi1I00IlO(this, iOoilo);
                        }
                    }
/* 43 */            Object objInvoke = iooi1I00IlO.I00iiO;
/* 45 */            Object obj = Ii0111o.I00iOIl;
/* 47 */            int i5 = iooi1I00IlO.I00ilI0I1;
                    try {
/* 52 */                if (i5 == 0) {
/* 73 */                    lIoii1l01l0i.I00000oOI(objInvoke);
/* 82 */                    if (iOI10i0I11.I00000oIO(context2, "android.permission.READ_CALENDAR") == 0) {
/* 117 */                       str2 = str;
/* 124 */                       OI011oo1 oI011oo1Build = new OI011oo1.I0000Il00O().build();
/* 138 */                       readCalendarEventsParams = (ReadCalendarEventsParams) oI011oo1Build.adapter(ReadCalendarEventsParams.class).fromJson(str2);
/* 142 */                       if (readCalendarEventsParams != null) {
/* 450 */                           Log.e("IntentHandler", "Failed to parse read_calendar_events parameters: " + str2);
/* 140 */                           return "failed";
                                }
/* 159 */                       Date date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(readCalendarEventsParams.getDate());
/* 163 */                       if (date == null) {
/* 434 */                           Log.e("IntentHandler", "Failed to parse read_calendar_events date: " + readCalendarEventsParams.getDate());
/* 140 */                           return "failed";
                                }
/* 165 */                       Calendar calendar = Calendar.getInstance();
/* 173 */                       calendar.setTimeInMillis(date.getTime());
/* 179 */                       calendar.set(11, 0);
/* 184 */                       calendar.set(12, 0);
/* 189 */                       calendar.set(13, 0);
/* 194 */                       calendar.set(14, 0);
/* 197 */                       long timeInMillis = calendar.getTimeInMillis();
/* 202 */                       calendar.add(5, 1);
/* 206 */                       calendar.add(14, -1);
/* 209 */                       long timeInMillis2 = calendar.getTimeInMillis();
/* 219 */                       Uri.Builder builderBuildUpon = CalendarContract.Instances.CONTENT_URI.buildUpon();
/* 223 */                       ContentUris.appendId(builderBuildUpon, timeInMillis);
/* 226 */                       ContentUris.appendId(builderBuildUpon, timeInMillis2);
/* 243 */                       Cursor cursorQuery = context2.getContentResolver().query(builderBuildUpon.build(), new String[]{"title", "description", "begin", "end"}, null, null, "begin ASC");
/* 249 */                       ArrayList arrayList = new ArrayList();
/* 252 */                       if (cursorQuery != null) {
                                    try {
/* 254 */                               int columnIndex = cursorQuery.getColumnIndex("title");
/* 258 */                               int columnIndex2 = cursorQuery.getColumnIndex("description");
/* 262 */                               int columnIndex3 = cursorQuery.getColumnIndex("begin");
/* 266 */                               int columnIndex4 = cursorQuery.getColumnIndex("end");
/* 278 */                               SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
/* 285 */                               while (cursorQuery.moveToNext()) {
/* 289 */                                   if (columnIndex < 0 || (string = cursorQuery.getString(columnIndex)) == null) {
/* 287 */                                       string = "";
                                            }
/* 303 */                                   if (columnIndex2 < 0 || (string2 = cursorQuery.getString(columnIndex2)) == null) {
/* 287 */                                       string2 = "";
                                            }
/* 322 */                                   long j2 = columnIndex3 >= 0 ? cursorQuery.getLong(columnIndex3) : 0L;
/* 325 */                                   if (columnIndex4 >= 0) {
/* 331 */                                       i = columnIndex4;
/* 333 */                                       i2 = columnIndex3;
/* 327 */                                       j = cursorQuery.getLong(columnIndex4);
                                            } else {
/* 337 */                                       i = columnIndex4;
/* 339 */                                       i2 = columnIndex3;
/* 341 */                                       j = 0;
                                            }
/* 347 */                                   if (j2 > 0) {
/* 349 */                                       i3 = columnIndex2;
/* 356 */                                       str3 = simpleDateFormat.format(new Date(j2));
                                            } else {
/* 361 */                                       i3 = columnIndex2;
/* 287 */                                       str3 = "";
                                            }
/* 380 */                                   arrayList.add(new CalendarEventDto(string, string2, str3, j > 0 ? simpleDateFormat.format(new Date(j)) : ""));
/* 383 */                                   columnIndex3 = i2;
/* 385 */                                   columnIndex4 = i;
/* 387 */                                   columnIndex2 = i3;
                                        }
/* 390 */                               cursorQuery.close();
                                    } finally {
                                    }
                                }
/* 413 */                       return oI011oo1Build.adapter(ReadCalendarEventsResponse.class).toJson(new ReadCalendarEventsResponse(arrayList));
                            }
/* 84 */                    iooi1I00IlO.I00iOIl = context2;
/* 86 */                    str2 = str;
/* 88 */                    iooi1I00IlO.I00iiI = str2;
/* 90 */                    iooi1I00IlO.I00ilI0I1 = 1;
/* 94 */                    objInvoke = i00oIiI10.invoke("android.permission.READ_CALENDAR", iooi1I00IlO);
/* 98 */                    if (objInvoke == obj) {
/* 100 */                       return obj;
                            }
                        } else {
/* 54 */                    if (i5 != 1) {
/* 68 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 71 */                        return null;
                            }
/* 56 */                    String str4 = iooi1I00IlO.I00iiI;
/* 58 */                    Context context3 = iooi1I00IlO.I00iOIl;
/* 60 */                    lIoii1l01l0i.I00000oOI(objInvoke);
/* 63 */                    str2 = str4;
/* 64 */                    context2 = context3;
                        }
/* 124 */               OI011oo1 oI011oo1Build2 = new OI011oo1.I0000Il00O().build();
/* 138 */               readCalendarEventsParams = (ReadCalendarEventsParams) oI011oo1Build2.adapter(ReadCalendarEventsParams.class).fromJson(str2);
/* 142 */               if (readCalendarEventsParams != null) {
                        }
                    } catch (Exception e) {
/* 468 */               Log.e("IntentHandler", "Failed to read calendar events: " + str2, e);
/* 477 */               return IIl001iO0Io.I000o00OoI0I("failed: ", e.getMessage());
                    }
/* 107 */           if (!((Boolean) objInvoke).booleanValue()) {
/* 111 */               Log.e("IntentHandler", "READ_CALENDAR permission denied by user");
/* 114 */               return "failed: READ_CALENDAR permission denied by user";
                    }
                }
            }
