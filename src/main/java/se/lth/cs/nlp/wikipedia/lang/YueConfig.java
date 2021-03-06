/**
 * This file is part of Wikiforia.
 *
 * Wikiforia is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * Wikiforia is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Wikiforia. If not, see <http://www.gnu.org/licenses/>.
 */
 package se.lth.cs.nlp.wikipedia.lang;

//Autogenerated from Wikimedia sources at 2015-04-16T13:55:11+00:00

public class YueConfig extends TemplateConfig {
	public YueConfig() {
		addNamespaceAlias(-2, "媒體", "媒体");
		addNamespaceAlias(-1, "特別", "特殊");
		addNamespaceAlias(1, "傾偈", "對話", "对话", "討論", "讨论");
		addNamespaceAlias(2, "用戶", "用户");
		addNamespaceAlias(3, "用戶傾偈", "用戶 對話", "用户 对话", "用戶 討論", "用户 讨论");
		addNamespaceAlias(5, "Wikipedia傾偈", "Wikipedia_傾偈");
		addNamespaceAlias(6, "文件", "檔", "檔案", "档", "档案", "圖", "圖像", "图", "图像", "Image");
		addNamespaceAlias(7, "文件傾偈", "Image_talk", "檔 討論", "档 讨论", "檔案 討論", "档案 讨论", "圖 討論", "图 讨论", "圖像 討論", "图像 讨论", "MediaWiki_傾偈");
		addNamespaceAlias(8, "MediaWiki");
		addNamespaceAlias(9, "MediaWiki傾偈");
		addNamespaceAlias(10, "模");
		addNamespaceAlias(11, "模傾偈", "模 討論", "模 讨论");
		addNamespaceAlias(12, "幫手", "幫助", "說明", "帮手", "帮助", "说明");
		addNamespaceAlias(13, "幫手傾偈", "幫手 討論", "幫助 討論", "說明 討論", "帮手 讨论", "帮助 讨论", "说明 讨论");
		addNamespaceAlias(14, "分類", "類", "类", "分类");
		addNamespaceAlias(15, "分類傾偈", "類 討論", "分類 討論", "类 讨论", "分类 讨论");

	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://yue.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "yue";
	}
}
