            package p000;

            import androidx.work.impl.WorkDatabase_Impl;
            import com.google.ai.edge.gallery.data.local.BoxChatDatabase_Impl;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            
/* 14 */    public final class II1oIiIOOo extends IioliO10l {
                public final int I0000O = 1;
                public final Oi1oIiOiIi0 I0000oI00;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public II1oIiIOOo(WorkDatabase_Impl workDatabase_Impl) {
/* 12 */            super("08b926448d86528e697981ddd30459f7", 24, "149fd8ad55885d3fe3549a37a0163243");
/* 4 */             this.I0000oI00 = workDatabase_Impl;
                }

                @Override
                public final void I00000oIO(Olil0III olil0III) {
                    switch (this.I0000O) {
                        case 0:
/* 84 */                    lO0I0Io.I00000oIO(olil0III, "CREATE TABLE IF NOT EXISTS `conversations` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `taskType` TEXT NOT NULL, `modelName` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, `messageCount` INTEGER NOT NULL, `systemPrompt` TEXT NOT NULL, PRIMARY KEY(`id`))");
/* 89 */                    lO0I0Io.I00000oIO(olil0III, "CREATE TABLE IF NOT EXISTS `messages` (`id` TEXT NOT NULL, `conversationId` TEXT NOT NULL, `role` TEXT NOT NULL, `content` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `tokenCount` INTEGER NOT NULL, `latencyMs` INTEGER NOT NULL, `imagePaths` TEXT, PRIMARY KEY(`id`), FOREIGN KEY(`conversationId`) REFERENCES `conversations`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
/* 94 */                    lO0I0Io.I00000oIO(olil0III, "CREATE INDEX IF NOT EXISTS `index_messages_conversationId` ON `messages` (`conversationId`)");
/* 99 */                    lO0I0Io.I00000oIO(olil0III, "CREATE TABLE IF NOT EXISTS `rag_documents` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `uri` TEXT NOT NULL, `created_at` INTEGER NOT NULL, `chunk_count` INTEGER NOT NULL, PRIMARY KEY(`id`))");
/* 104 */                   lO0I0Io.I00000oIO(olil0III, "CREATE TABLE IF NOT EXISTS `rag_chunks` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `document_id` TEXT NOT NULL, `ordinal` INTEGER NOT NULL, `text` TEXT NOT NULL, `embedding` BLOB NOT NULL, FOREIGN KEY(`document_id`) REFERENCES `rag_documents`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
/* 109 */                   lO0I0Io.I00000oIO(olil0III, "CREATE INDEX IF NOT EXISTS `index_rag_chunks_document_id` ON `rag_chunks` (`document_id`)");
/* 114 */                   lO0I0Io.I00000oIO(olil0III, "CREATE TABLE IF NOT EXISTS `faces` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `embedding` BLOB NOT NULL, `thumbnail` BLOB NOT NULL, `created_at` INTEGER NOT NULL)");
/* 117 */                   lO0I0Io.I00000oIO(olil0III, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
/* 122 */                   lO0I0Io.I00000oIO(olil0III, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fb88e73a15f79a6293f252c89cf3d341')");
                            break;
                        default:
/* 10 */                    lO0I0Io.I00000oIO(olil0III, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
/* 15 */                    lO0I0Io.I00000oIO(olil0III, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
/* 20 */                    lO0I0Io.I00000oIO(olil0III, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
/* 25 */                    lO0I0Io.I00000oIO(olil0III, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
/* 30 */                    lO0I0Io.I00000oIO(olil0III, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
/* 35 */                    lO0I0Io.I00000oIO(olil0III, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
/* 40 */                    lO0I0Io.I00000oIO(olil0III, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
/* 45 */                    lO0I0Io.I00000oIO(olil0III, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
/* 50 */                    lO0I0Io.I00000oIO(olil0III, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
/* 55 */                    lO0I0Io.I00000oIO(olil0III, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
/* 60 */                    lO0I0Io.I00000oIO(olil0III, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
/* 65 */                    lO0I0Io.I00000oIO(olil0III, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
/* 70 */                    lO0I0Io.I00000oIO(olil0III, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
/* 73 */                    lO0I0Io.I00000oIO(olil0III, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
/* 78 */                    lO0I0Io.I00000oIO(olil0III, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
                            break;
                    }
                }

                @Override
                public final void I00000oOI(Olil0III olil0III) {
                    switch (this.I0000O) {
                        case 0:
/* 44 */                    lO0I0Io.I00000oIO(olil0III, "DROP TABLE IF EXISTS `conversations`");
/* 49 */                    lO0I0Io.I00000oIO(olil0III, "DROP TABLE IF EXISTS `messages`");
/* 54 */                    lO0I0Io.I00000oIO(olil0III, "DROP TABLE IF EXISTS `rag_documents`");
/* 59 */                    lO0I0Io.I00000oIO(olil0III, "DROP TABLE IF EXISTS `rag_chunks`");
/* 64 */                    lO0I0Io.I00000oIO(olil0III, "DROP TABLE IF EXISTS `faces`");
                            break;
                        default:
/* 8 */                     lO0I0Io.I00000oIO(olil0III, "DROP TABLE IF EXISTS `Dependency`");
/* 13 */                    lO0I0Io.I00000oIO(olil0III, "DROP TABLE IF EXISTS `WorkSpec`");
/* 18 */                    lO0I0Io.I00000oIO(olil0III, "DROP TABLE IF EXISTS `WorkTag`");
/* 23 */                    lO0I0Io.I00000oIO(olil0III, "DROP TABLE IF EXISTS `SystemIdInfo`");
/* 28 */                    lO0I0Io.I00000oIO(olil0III, "DROP TABLE IF EXISTS `WorkName`");
/* 33 */                    lO0I0Io.I00000oIO(olil0III, "DROP TABLE IF EXISTS `WorkProgress`");
/* 38 */                    lO0I0Io.I00000oIO(olil0III, "DROP TABLE IF EXISTS `Preference`");
                            break;
                    }
                }

                @Override
                public final void I0000Il00O() {
/* 1 */             int i = this.I0000O;
                }

                @Override
                public final void I0000O(Olil0III olil0III) {
/* 1 */             int i = this.I0000O;
/* 3 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I0000oI00;
                    switch (i) {
                        case 0:
/* 19 */                    lO0I0Io.I00000oIO(olil0III, "PRAGMA foreign_keys = ON");
/* 24 */                    ((BoxChatDatabase_Impl) oi1oIiOiIi0).I000o00OoI0I(olil0III);
                            break;
                        default:
/* 10 */                    lO0I0Io.I00000oIO(olil0III, "PRAGMA foreign_keys = ON");
/* 15 */                    ((WorkDatabase_Impl) oi1oIiOiIi0).I000o00OoI0I(olil0III);
                            break;
                    }
                }

                @Override
                public final void I0000oI00() {
/* 1 */             int i = this.I0000O;
                }

                @Override
                public final void I0001Ioi1lo(Olil0III olil0III) {
                    switch (this.I0000O) {
                        case 0:
/* 10 */                    il01iOI.I00000oIO(olil0III);
                            break;
                        default:
/* 6 */                     il01iOI.I00000oIO(olil0III);
                            break;
                    }
                }

                @Override
                public final I0OIOIi1 I000II(Olil0III olil0III) {
                    switch (this.I0000O) {
                        case 0:
/* 1654 */                  LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 1670 */                  linkedHashMap.put("id", new Olo000("id", "TEXT", true, 1, null, 1));
/* 1694 */                  linkedHashMap.put("title", new Olo000("title", "TEXT", true, 0, null, 1));
/* 1709 */                  linkedHashMap.put("taskType", new Olo000("taskType", "TEXT", true, 0, null, 1));
/* 1725 */                  linkedHashMap.put("modelName", new Olo000("modelName", "TEXT", true, 0, null, 1));
/* 1741 */                  linkedHashMap.put("createdAt", new Olo000("createdAt", "INTEGER", true, 0, null, 1));
/* 1757 */                  linkedHashMap.put("updatedAt", new Olo000("updatedAt", "INTEGER", true, 0, null, 1));
/* 1773 */                  linkedHashMap.put("messageCount", new Olo000("messageCount", "INTEGER", true, 0, null, 1));
/* 1789 */                  linkedHashMap.put("systemPrompt", new Olo000("systemPrompt", "TEXT", true, 0, null, 1));
/* 1806 */                  Olo01l olo01l = new Olo01l("conversations", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
/* 1809 */                  Olo01l olo01lI00000oIO = lOii0ii1111o.I00000oIO(olil0III, "conversations");
/* 1817 */                  if (!olo01l.equals(olo01lI00000oIO)) {
                                break;
                            } else {
/* 1848 */                      LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 1864 */                      linkedHashMap2.put("id", new Olo000("id", "TEXT", true, 1, null, 1));
/* 1888 */                      linkedHashMap2.put("conversationId", new Olo000("conversationId", "TEXT", true, 0, null, 1));
/* 1904 */                      linkedHashMap2.put("role", new Olo000("role", "TEXT", true, 0, null, 1));
/* 1920 */                      linkedHashMap2.put("content", new Olo000("content", "TEXT", true, 0, null, 1));
/* 1936 */                      linkedHashMap2.put("timestamp", new Olo000("timestamp", "INTEGER", true, 0, null, 1));
/* 1952 */                      linkedHashMap2.put("tokenCount", new Olo000("tokenCount", "INTEGER", true, 0, null, 1));
/* 1968 */                      linkedHashMap2.put("latencyMs", new Olo000("latencyMs", "INTEGER", true, 0, null, 1));
/* 1986 */                      linkedHashMap2.put("imagePaths", new Olo000("imagePaths", "TEXT", false, 0, null, 1));
/* 1991 */                      LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 2013 */                      linkedHashSet.add(new Olo001I0l("conversations", "CASCADE", "NO ACTION", Collections.singletonList("conversationId"), Collections.singletonList("id")));
/* 2018 */                      LinkedHashSet linkedHashSet2 = new LinkedHashSet();
/* 2036 */                      linkedHashSet2.add(new Olo001i0l1("index_messages_conversationId", false, Collections.singletonList("conversationId"), Collections.singletonList("ASC")));
/* 2043 */                      Olo01l olo01l2 = new Olo01l("messages", linkedHashMap2, linkedHashSet, linkedHashSet2);
/* 2046 */                      Olo01l olo01lI00000oIO2 = lOii0ii1111o.I00000oIO(olil0III, "messages");
/* 2054 */                      if (!olo01l2.equals(olo01lI00000oIO2)) {
                                    break;
                                } else {
/* 2085 */                          LinkedHashMap linkedHashMap3 = new LinkedHashMap();
/* 2101 */                          linkedHashMap3.put("id", new Olo000("id", "TEXT", true, 1, null, 1));
/* 2123 */                          linkedHashMap3.put("title", new Olo000("title", "TEXT", true, 0, null, 1));
/* 2138 */                          linkedHashMap3.put("uri", new Olo000("uri", "TEXT", true, 0, null, 1));
/* 2154 */                          linkedHashMap3.put("created_at", new Olo000("created_at", "INTEGER", true, 0, null, 1));
/* 2168 */                          linkedHashMap3.put("chunk_count", new Olo000("chunk_count", "INTEGER", true, 0, null, 1));
/* 2185 */                          Olo01l olo01l3 = new Olo01l("rag_documents", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
/* 2188 */                          Olo01l olo01lI00000oIO3 = lOii0ii1111o.I00000oIO(olil0III, "rag_documents");
/* 2196 */                          if (!olo01l3.equals(olo01lI00000oIO3)) {
                                        break;
                                    } else {
/* 2227 */                              LinkedHashMap linkedHashMap4 = new LinkedHashMap();
/* 2243 */                              linkedHashMap4.put("id", new Olo000("id", "INTEGER", true, 1, null, 1));
/* 2267 */                              linkedHashMap4.put("document_id", new Olo000("document_id", "TEXT", true, 0, null, 1));
/* 2283 */                              linkedHashMap4.put("ordinal", new Olo000("ordinal", "INTEGER", true, 0, null, 1));
/* 2299 */                              linkedHashMap4.put("text", new Olo000("text", "TEXT", true, 0, null, 1));
/* 2315 */                              linkedHashMap4.put("embedding", new Olo000("embedding", "BLOB", true, 0, null, 1));
/* 2320 */                              LinkedHashSet linkedHashSet3 = new LinkedHashSet();
/* 2344 */                              linkedHashSet3.add(new Olo001I0l("rag_documents", "CASCADE", "NO ACTION", Collections.singletonList("document_id"), Collections.singletonList("id")));
/* 2349 */                              LinkedHashSet linkedHashSet4 = new LinkedHashSet();
/* 2367 */                              linkedHashSet4.add(new Olo001i0l1("index_rag_chunks_document_id", false, Collections.singletonList("document_id"), Collections.singletonList("ASC")));
/* 2374 */                              Olo01l olo01l4 = new Olo01l("rag_chunks", linkedHashMap4, linkedHashSet3, linkedHashSet4);
/* 2377 */                              Olo01l olo01lI00000oIO4 = lOii0ii1111o.I00000oIO(olil0III, "rag_chunks");
/* 2385 */                              if (!olo01l4.equals(olo01lI00000oIO4)) {
                                            break;
                                        } else {
/* 2416 */                                  LinkedHashMap linkedHashMap5 = new LinkedHashMap();
/* 2438 */                                  linkedHashMap5.put("id", new Olo000("id", "INTEGER", true, 1, null, 1));
/* 2454 */                                  linkedHashMap5.put("name", new Olo000("name", "TEXT", true, 0, null, 1));
/* 2468 */                                  linkedHashMap5.put("embedding", new Olo000("embedding", "BLOB", true, 0, null, 1));
/* 2484 */                                  linkedHashMap5.put("thumbnail", new Olo000("thumbnail", "BLOB", true, 0, null, 1));
/* 2500 */                                  linkedHashMap5.put("created_at", new Olo000("created_at", "INTEGER", true, 0, null, 1));
/* 2517 */                                  Olo01l olo01l5 = new Olo01l("faces", linkedHashMap5, new LinkedHashSet(), new LinkedHashSet());
/* 2520 */                                  Olo01l olo01lI00000oIO5 = lOii0ii1111o.I00000oIO(olil0III, "faces");
/* 2528 */                                  if (!olo01l5.equals(olo01lI00000oIO5)) {
                                                break;
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        default:
/* 21 */                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
/* 39 */                    linkedHashMap6.put("work_spec_id", new Olo000("work_spec_id", "TEXT", true, 1, null, 1));
/* 59 */                    linkedHashMap6.put("prerequisite_id", new Olo000("prerequisite_id", "TEXT", true, 2, null, 1));
/* 64 */                    LinkedHashSet linkedHashSet5 = new LinkedHashSet();
/* 86 */                    linkedHashSet5.add(new Olo001I0l("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
/* 108 */                   linkedHashSet5.add(new Olo001I0l("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("prerequisite_id"), Collections.singletonList("id")));
/* 113 */                   LinkedHashSet linkedHashSet6 = new LinkedHashSet();
/* 131 */                   linkedHashSet6.add(new Olo001i0l1("index_Dependency_work_spec_id", false, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC")));
/* 149 */                   linkedHashSet6.add(new Olo001i0l1("index_Dependency_prerequisite_id", false, Collections.singletonList("prerequisite_id"), Collections.singletonList("ASC")));
/* 156 */                   Olo01l olo01l6 = new Olo01l("Dependency", linkedHashMap6, linkedHashSet5, linkedHashSet6);
/* 159 */                   Olo01l olo01lI00000oIO6 = lOii0ii1111o.I00000oIO(olil0III, "Dependency");
/* 167 */                   if (!olo01l6.equals(olo01lI00000oIO6)) {
                                break;
                            } else {
/* 198 */                       LinkedHashMap linkedHashMap7 = new LinkedHashMap();
/* 216 */                       linkedHashMap7.put("id", new Olo000("id", "TEXT", true, 1, null, 1));
/* 236 */                       linkedHashMap7.put("state", new Olo000("state", "INTEGER", true, 0, null, 1));
/* 258 */                       linkedHashMap7.put("worker_class_name", new Olo000("worker_class_name", "TEXT", true, 0, null, 1));
/* 280 */                       linkedHashMap7.put("input_merger_class_name", new Olo000("input_merger_class_name", "TEXT", true, 0, null, 1));
/* 302 */                       linkedHashMap7.put("input", new Olo000("input", "BLOB", true, 0, null, 1));
/* 326 */                       linkedHashMap7.put("output", new Olo000("output", "BLOB", true, 0, null, 1));
/* 346 */                       linkedHashMap7.put("initial_delay", new Olo000("initial_delay", "INTEGER", true, 0, null, 1));
/* 367 */                       linkedHashMap7.put("interval_duration", new Olo000("interval_duration", "INTEGER", true, 0, null, 1));
/* 387 */                       linkedHashMap7.put("flex_duration", new Olo000("flex_duration", "INTEGER", true, 0, null, 1));
/* 409 */                       linkedHashMap7.put("run_attempt_count", new Olo000("run_attempt_count", "INTEGER", true, 0, null, 1));
/* 431 */                       linkedHashMap7.put("backoff_policy", new Olo000("backoff_policy", "INTEGER", true, 0, null, 1));
/* 453 */                       linkedHashMap7.put("backoff_delay_duration", new Olo000("backoff_delay_duration", "INTEGER", true, 0, null, 1));
/* 473 */                       linkedHashMap7.put("last_enqueue_time", new Olo000("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
/* 494 */                       linkedHashMap7.put("minimum_retention_duration", new Olo000("minimum_retention_duration", "INTEGER", true, 0, null, 1));
/* 514 */                       linkedHashMap7.put("schedule_requested_at", new Olo000("schedule_requested_at", "INTEGER", true, 0, null, 1));
/* 536 */                       linkedHashMap7.put("run_in_foreground", new Olo000("run_in_foreground", "INTEGER", true, 0, null, 1));
/* 558 */                       linkedHashMap7.put("out_of_quota_policy", new Olo000("out_of_quota_policy", "INTEGER", true, 0, null, 1));
/* 580 */                       linkedHashMap7.put("period_count", new Olo000("period_count", "INTEGER", true, 0, OIllioIilO.I01OO1I, 1));
/* 600 */                       linkedHashMap7.put("generation", new Olo000("generation", "INTEGER", true, 0, OIllioIilO.I01OO1I, 1));
/* 622 */                       linkedHashMap7.put("next_schedule_time_override", new Olo000("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
/* 644 */                       linkedHashMap7.put("next_schedule_time_override_generation", new Olo000("next_schedule_time_override_generation", "INTEGER", true, 0, OIllioIilO.I01OO1I, 1));
/* 666 */                       linkedHashMap7.put("stop_reason", new Olo000("stop_reason", "INTEGER", true, 0, "-256", 1));
/* 688 */                       linkedHashMap7.put("trace_tag", new Olo000("trace_tag", "TEXT", false, 0, null, 1));
/* 708 */                       linkedHashMap7.put("backoff_on_system_interruptions", new Olo000("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
/* 730 */                       linkedHashMap7.put("required_network_type", new Olo000("required_network_type", "INTEGER", true, 0, null, 1));
/* 752 */                       linkedHashMap7.put("required_network_request", new Olo000("required_network_request", "BLOB", true, 0, "x''", 1));
/* 774 */                       linkedHashMap7.put("requires_charging", new Olo000("requires_charging", "INTEGER", true, 0, null, 1));
/* 796 */                       linkedHashMap7.put("requires_device_idle", new Olo000("requires_device_idle", "INTEGER", true, 0, null, 1));
/* 818 */                       linkedHashMap7.put("requires_battery_not_low", new Olo000("requires_battery_not_low", "INTEGER", true, 0, null, 1));
/* 840 */                       linkedHashMap7.put("requires_storage_not_low", new Olo000("requires_storage_not_low", "INTEGER", true, 0, null, 1));
/* 862 */                       linkedHashMap7.put("trigger_content_update_delay", new Olo000("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
/* 884 */                       linkedHashMap7.put("trigger_max_content_delay", new Olo000("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
/* 906 */                       linkedHashMap7.put("content_uri_triggers", new Olo000("content_uri_triggers", "BLOB", true, 0, null, 1));
/* 911 */                       LinkedHashSet linkedHashSet7 = new LinkedHashSet();
/* 916 */                       LinkedHashSet linkedHashSet8 = new LinkedHashSet();
/* 934 */                       linkedHashSet8.add(new Olo001i0l1("index_WorkSpec_schedule_requested_at", false, Collections.singletonList("schedule_requested_at"), Collections.singletonList("ASC")));
/* 952 */                       linkedHashSet8.add(new Olo001i0l1("index_WorkSpec_last_enqueue_time", false, Collections.singletonList("last_enqueue_time"), Collections.singletonList("ASC")));
/* 959 */                       Olo01l olo01l7 = new Olo01l("WorkSpec", linkedHashMap7, linkedHashSet7, linkedHashSet8);
/* 962 */                       Olo01l olo01lI00000oIO7 = lOii0ii1111o.I00000oIO(olil0III, "WorkSpec");
/* 970 */                       if (!olo01l7.equals(olo01lI00000oIO7)) {
                                    break;
                                } else {
/* 1001 */                          LinkedHashMap linkedHashMap8 = new LinkedHashMap();
/* 1025 */                          linkedHashMap8.put("tag", new Olo000("tag", "TEXT", true, 1, null, 1));
/* 1041 */                          linkedHashMap8.put("work_spec_id", new Olo000("work_spec_id", "TEXT", true, 2, null, 1));
/* 1046 */                          LinkedHashSet linkedHashSet9 = new LinkedHashSet();
/* 1070 */                          linkedHashSet9.add(new Olo001I0l("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
/* 1075 */                          LinkedHashSet linkedHashSet10 = new LinkedHashSet();
/* 1093 */                          linkedHashSet10.add(new Olo001i0l1("index_WorkTag_work_spec_id", false, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC")));
/* 1100 */                          Olo01l olo01l8 = new Olo01l("WorkTag", linkedHashMap8, linkedHashSet9, linkedHashSet10);
/* 1103 */                          Olo01l olo01lI00000oIO8 = lOii0ii1111o.I00000oIO(olil0III, "WorkTag");
/* 1111 */                          if (!olo01l8.equals(olo01lI00000oIO8)) {
                                        break;
                                    } else {
/* 1142 */                              LinkedHashMap linkedHashMap9 = new LinkedHashMap();
/* 1164 */                              linkedHashMap9.put("work_spec_id", new Olo000("work_spec_id", "TEXT", true, 1, null, 1));
/* 1182 */                              linkedHashMap9.put("generation", new Olo000("generation", "INTEGER", true, 2, OIllioIilO.I01OO1I, 1));
/* 1202 */                              linkedHashMap9.put("system_id", new Olo000("system_id", "INTEGER", true, 0, null, 1));
/* 1207 */                              LinkedHashSet linkedHashSet11 = new LinkedHashSet();
/* 1231 */                              linkedHashSet11.add(new Olo001I0l("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
/* 1243 */                              Olo01l olo01l9 = new Olo01l("SystemIdInfo", linkedHashMap9, linkedHashSet11, new LinkedHashSet());
/* 1246 */                              Olo01l olo01lI00000oIO9 = lOii0ii1111o.I00000oIO(olil0III, "SystemIdInfo");
/* 1254 */                              if (!olo01l9.equals(olo01lI00000oIO9)) {
                                            break;
                                        } else {
/* 1285 */                                  LinkedHashMap linkedHashMap10 = new LinkedHashMap();
/* 1307 */                                  linkedHashMap10.put("name", new Olo000("name", "TEXT", true, 1, null, 1));
/* 1323 */                                  linkedHashMap10.put("work_spec_id", new Olo000("work_spec_id", "TEXT", true, 2, null, 1));
/* 1328 */                                  LinkedHashSet linkedHashSet12 = new LinkedHashSet();
/* 1352 */                                  linkedHashSet12.add(new Olo001I0l("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
/* 1357 */                                  LinkedHashSet linkedHashSet13 = new LinkedHashSet();
/* 1375 */                                  linkedHashSet13.add(new Olo001i0l1("index_WorkName_work_spec_id", false, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC")));
/* 1382 */                                  Olo01l olo01l10 = new Olo01l("WorkName", linkedHashMap10, linkedHashSet12, linkedHashSet13);
/* 1385 */                                  Olo01l olo01lI00000oIO10 = lOii0ii1111o.I00000oIO(olil0III, "WorkName");
/* 1393 */                                  if (!olo01l10.equals(olo01lI00000oIO10)) {
                                                break;
                                            } else {
/* 1424 */                                      LinkedHashMap linkedHashMap11 = new LinkedHashMap();
/* 1446 */                                      linkedHashMap11.put("work_spec_id", new Olo000("work_spec_id", "TEXT", true, 1, null, 1));
/* 1464 */                                      linkedHashMap11.put("progress", new Olo000("progress", "BLOB", true, 0, null, 1));
/* 1469 */                                      LinkedHashSet linkedHashSet14 = new LinkedHashSet();
/* 1493 */                                      linkedHashSet14.add(new Olo001I0l("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
/* 1505 */                                      Olo01l olo01l11 = new Olo01l("WorkProgress", linkedHashMap11, linkedHashSet14, new LinkedHashSet());
/* 1508 */                                      Olo01l olo01lI00000oIO11 = lOii0ii1111o.I00000oIO(olil0III, "WorkProgress");
/* 1516 */                                      if (!olo01l11.equals(olo01lI00000oIO11)) {
                                                    break;
                                                } else {
/* 1546 */                                          LinkedHashMap linkedHashMap12 = new LinkedHashMap();
/* 1564 */                                          linkedHashMap12.put("key", new Olo000("key", "TEXT", true, 1, null, 1));
/* 1588 */                                          linkedHashMap12.put("long_value", new Olo000("long_value", "INTEGER", false, 0, null, 1));
/* 1605 */                                          Olo01l olo01l12 = new Olo01l("Preference", linkedHashMap12, new LinkedHashSet(), new LinkedHashSet());
/* 1608 */                                          Olo01l olo01lI00000oIO12 = lOii0ii1111o.I00000oIO(olil0III, "Preference");
/* 1616 */                                          if (!olo01l12.equals(olo01lI00000oIO12)) {
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                    }
/* 1648 */          return new I0OIOIi1(null, true);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 15 */        public II1oIiIOOo(BoxChatDatabase_Impl boxChatDatabase_Impl) {
/* 16 */            super("fb88e73a15f79a6293f252c89cf3d341", 5, "c62c3487198b40f8c10406a96c5fbbc0");
                    this.I0000oI00 = boxChatDatabase_Impl;
                }

/* 19 */        private final void I000O01llI0() {
                }

/* 19 */        private final void I000OOo1O() {
                }

/* 19 */        private final void I000OiO() {
                }

/* 19 */        private final void I000iOII() {
                }
            }
